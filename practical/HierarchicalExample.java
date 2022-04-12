class Metal{
String weight=" 45";
String color="purple";
}

class Gold extends Metal{
String gold= "hue";
}
class Silver extends Metal{
String silver="luster";
}

class HierarchicalExample{
public static void main(String args[]){
Gold g = new Gold();
Silver s = new Silver();
System.out.println("Gold is :"+g.gold);
System.out.println("Silver is :"+s.silver);
}
}