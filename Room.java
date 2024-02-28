class Room {
    public static void main(String[] args) {
        
        Room r = new Room();
        float v = r.volume(3,4,6);
        System.out.println(v);
    }
    float volume(float x,float y,float z)
    {
        
        float vol;
        vol = x*y*z;
        return vol;
    }
}