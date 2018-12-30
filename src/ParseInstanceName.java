
import java.util.HashMap;
import java.util.Map;

public class ParseInstanceName {

    public static void main(String[] args) {

        String str = "workmanager_completed_requests{name=\"MySQL44 JDBC Data Source-0\",applicationName=\"MySQL44 JDBC Data Source-0\"} 12345";

        getMetricName(str);
    }

    static void getMetricName(String strParam){

        int startIndex = strParam.indexOf('{');

        int endIndex = strParam.indexOf('}');

        String tages = strParam.substring(startIndex+1,endIndex);
      //  System.out.println(tages);

        String instance =  getTag(tages,1);
        System.out.println("Instance :"+ instance);

        String instanceKpi = strParam.substring(0,startIndex);
       // System.out.println(instanceKpi);

        String kpi =  getInstance(instanceKpi,"workmanager");
        System.out.println("KPI is :" + kpi);

        String value = strParam.substring(endIndex+2,strParam.length());
        System.out.println(value);
    }

   static String getTag(String tages,int number){

        String[] tag = tages.split(",");
        String selectTag = tag[number];

        String[] appTag = selectTag.split("=");

        String instance = appTag[1].replace("\"","").replace("\"","");

        return instance;
   }

   static String getInstance(String instanceKpi,String prefix){

       String[] kpiName = instanceKpi.split(prefix+"_");

        return kpiName[1];
   }
}
