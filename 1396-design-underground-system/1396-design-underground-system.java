class UndergroundSystem {
    //station time
    HashMap<String,ArrayList<Integer>> map_time;
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
        ArrayList<Integer> lt=map_time.getOrDefault(key,new ArrayList<>());
        lt.add(t-map_checkIn.get(id));
        map_time.put(key,lt);
        map_curr.remove(id);
        map_checkIn.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key=startStation+"-"+endStation;
        ArrayList<Integer> lt=map_time.get(key);
        double s=0;
        for(int i=0;i<lt.size();i++) s=s+lt.get(i);
        return s/lt.size();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */