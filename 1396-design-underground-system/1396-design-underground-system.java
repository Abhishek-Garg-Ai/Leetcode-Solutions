class UndergroundSystem {
    //station time
    HashMap<String,String> map_time;
    //checkIn time
    HashMap<Integer,Integer> map_checkIn;
    //current station
    HashMap<Integer,String> map_curr;
    
    public UndergroundSystem() {
        map_time=new HashMap<>();
        map_checkIn=new HashMap<>();
        map_curr=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map_curr.put(id,stationName);
        map_checkIn.put(id,t);
    }
    
    public void checkOut(int id, String stationName, int t) {
        String key=map_curr.get(id)+"-"+stationName;
        String time=map_time.getOrDefault(key,"0");
        time+=" "+(t-map_checkIn.get(id));
        map_time.put(key,time);
        map_curr.remove(id);
        map_checkIn.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key=startStation+"-"+endStation;
        String[] lt=map_time.get(key).split(" ");
        double s=0;
        for(int i=0;i<lt.length;i++) s=s+Integer.valueOf(lt[i]);
        return s/(lt.length-1);
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */