class Demo extends File_box
{
    public static void main(String args[])
    {
        File_box f=new File_box();
        f.volume();
    }
}
class File_box 
{
    int length=4;
    int width=6;
    int height=8;
    void volume()
    {
        int vol;
        vol=length*width*height;
        System.out.println("volume="+vol);
    }
    
}
