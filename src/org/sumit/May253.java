package org.sumit;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Scanner;


public class May253 {
    public enum EmpCode {
        ASSOCIATE,SENIOR_ASSOCIATE,MANAGER,SENIOR_MANAGER;

        private int code;

        public static EmpCode getEnum(int code) {
            EmpCode e = null;
            try {

                EnumMap<EmpCode, Integer> map = new EnumMap<EmpCode, Integer>(EmpCode.class);
                map.put(EmpCode.ASSOCIATE, 10001);
                map.put(EmpCode.SENIOR_ASSOCIATE, 10002);
                map.put(EmpCode.MANAGER, 10003);
                map.put(EmpCode.SENIOR_MANAGER, 10004);

                //System.out.println(map);
                int ass = map.get(EmpCode.ASSOCIATE);
                if (ass == code) {
                    e = EmpCode.ASSOCIATE;
                }
                int ass1 = map.get(EmpCode.SENIOR_ASSOCIATE);
                if (ass1 == code) {
                    e = EmpCode.SENIOR_ASSOCIATE;
                }
                int ass2 = map.get(EmpCode.MANAGER);
                if (ass2 == code) {
                    e = EmpCode.MANAGER;
                }
                int ass3 = map.get(EmpCode.SENIOR_MANAGER);
                if (ass3 == code) {
                    e = EmpCode.SENIOR_MANAGER;
                }
                if(ass!=code && ass1!=code && ass2!=code && ass3!=code){
                    
                }
            }catch (Exception exp){
                exp.printStackTrace();
            }
            return e;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codeFromDB = scan.nextInt();
        try {
            System.out.println(EmpCode.getEnum(codeFromDB));
        } catch(IllegalArgumentException e) {
            System.out.println(e.toString());
        }
        scan.close();
    }
}
