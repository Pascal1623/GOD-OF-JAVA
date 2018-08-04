public class ProfilePrint {
    byte Age;
    String Name;
    boolean isMarried;
    public static void main(String args[]){
        byte Age=25;
        String Name="양훈석";
        boolean isMarried=false;
        ProfilePrint Profile=new ProfilePrint();
        Profile.setAge(Age);
        Profile.setName(Name);
        Profile.setMarried(isMarried);

        System.out.println("나이 "+Profile.getAge());
        System.out.println("이름 "+Profile.getName());
        System.out.println("결혼 여부 "+Profile.isMarried());

    }
    public void setAge(byte age){
        Age=age;
    }
    public byte getAge(){
        return Age;
    }
    public void setName(String name){
        Name=name;
    }
    public String getName(){
        return Name;
    }
    public void setMarried(boolean flag){
        isMarried=flag;
    }
    public boolean isMarried(){
        return isMarried;
    }

}
