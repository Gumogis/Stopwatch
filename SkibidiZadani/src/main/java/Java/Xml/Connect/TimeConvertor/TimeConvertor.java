package Java.Xml.Connect.TimeConvertor;

public class TimeConvertor {
    public static String ConvertTime(long l){
        return ((l/3600000)%24  + ":" + (l/60000)%60 + ":" + (l/1000)%60 + ":" + l%1000) ;
    }
}
