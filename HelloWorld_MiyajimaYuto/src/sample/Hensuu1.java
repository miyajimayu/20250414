package sample;



public class Hensuu1 {
public static void main(String[] args) {
byte byteNum;
short shNum;
int intNum;
long longNum;
float flNum;
double douNum;
char chaNum;
String aisatu;
boolean booNum;




byteNum = 0;
shNum = 0;
intNum = 0;
longNum = 0L;
flNum = 0.0f;
douNum = 0.0;
chaNum ='A';
aisatu ="null";
booNum = false;



byteNum = 10;
shNum = 100;
intNum = 1000;
longNum = 10000;
flNum = 9.5f;
douNum = 10.5;
chaNum ='a';
aisatu = "ハロー";
booNum = true;


System.out.println(byteNum + shNum + intNum + longNum );

System.out.println(byteNum * 2 );

System.out.println(chaNum + aisatu + booNum );

System.out.println(byteNum + shNum + intNum + longNum + flNum + douNum );

System.out.println(byteNum * shNum * intNum * longNum);
	
System.out.println(douNum / shNum);

System.out.println(byteNum - shNum );


String num="ハロー JAVA";	
int num1=43;
System.out.println(num + num1 );


String strNum1 ="山田太郎";
String strNum2 ="寿司";
String strNum3 ="初めまして";
String strNum4 ="年齢は";
String strNum5 ="歳です";
String strNum6 ="身長は";
String strNum7 ="cmです";
String strNum8 ="体重は";
String strNum9 ="kgです";
String strNum10 ="好きな食べ物は";
String strNum11 ="BMIは";
String strdesu ="です";

int intNum1= 18;
double douNum1 =170.5;
double douNum2 =62.2;
double douNum3 =1.705;

System.out.println(strNum3 + strNum1 + strdesu );

System.out.println(strNum4 + intNum1 + strNum5);

System.out.println(strNum6 + douNum1 + strNum7);

System.out.println(strNum8 + douNum2 + strNum9);

System.out.println(strNum10 +strNum2 + strdesu);

System.out.println(strNum11 + (douNum2 / (douNum3 * douNum3)) + strdesu);


strNum1 ="鈴木一朗";
strNum2 ="オムライス";

intNum1 = 24;
douNum1 = 168.5;
douNum2 = 64.2;
douNum3 = 1.685;

System.out.println(strNum3 + strNum1 + strdesu );

System.out.println(strNum4 + intNum1 + strNum5);

System.out.println(strNum6 + douNum1 + strNum7);

System.out.println(strNum8 + douNum2 + strNum9);

System.out.println(strNum10 +strNum2 + strdesu);

System.out.println(strNum11 + (douNum2 / (douNum3 * douNum3)) + strdesu);



intNum1 = intNum1 + intNum1;
douNum1 = douNum1 + douNum1;
douNum2 = douNum2 + douNum2;
douNum3 = douNum3 + douNum3;


System.out.println(strNum3 + strNum1 + strdesu );

System.out.println(strNum4 + intNum1 + strNum5);

System.out.println(strNum6 + douNum1 + strNum7);

System.out.println(strNum8 + douNum2 + strNum9);

System.out.println(strNum10 +strNum2 + strdesu);

System.out.println(strNum11 + (douNum2 / (douNum3 * douNum3)) + strdesu);



String result = intNum1 > 24 ? "true" : "fales";

System.out.println(result); //true


intNum1 = 24;
douNum1 = 168.5;
douNum2 = 64.2;

String nenrei = String.valueOf(intNum1);
System.out.println(strNum4 + nenrei + strNum5);

String sinntyou = String.valueOf(douNum1);
System.out.println(strNum6 + sinntyou + strNum7);

String taijuu = String.valueOf(douNum2);
System.out.println(strNum8 + taijuu + strNum9);


int suuji = Integer.parseInt(nenrei);
System.out.println(strNum4 + suuji + strNum5);

double takasa = Double.parseDouble(sinntyou);
System.out.println(strNum6 + takasa + strNum7);

boolean tosi = (suuji == 25);
boolean saizu = (takasa >= 160); 

String result1 =  !tosi ? "true" : saizu ?  "true" : "false";
System.out.println(result1); 

}
}
