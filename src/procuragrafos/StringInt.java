package procuragrafos;

public class StringInt {

    public static Integer StringInt(String entrada) {
        Integer a = 0;
        
        for(int b=0;b<entrada.length();b++){
            if(entrada.charAt(b)=='0'){
                a=a*10;
            }
            else if(entrada.charAt(b)=='1'){
                a=a*10;
                a=a+1;
            }
            else if(entrada.charAt(b)=='2'){
                a=a*10;
                a=a+2;
            }
            else if(entrada.charAt(b)=='3'){
                a=a*10;
                a=a+3;
            }
            else if(entrada.charAt(b)=='4'){
                a=a*10;
                a=a+4;
            }
            else if(entrada.charAt(b)=='5'){
                a=a*10;
                a=a+5;
            }
            else if(entrada.charAt(b)=='6'){
                a=a*10;
                a=a+6;
            }
            else if(entrada.charAt(b)=='7'){
                a=a*10;
                a=a+7;
            }
            else if(entrada.charAt(b)=='8'){
                a=a*10;
                a=a+8;
            }
            else if(entrada.charAt(b)=='9'){
                a=a*10;
                a=a+9;
            }
            
        }
        return a;
    }

    StringInt(int saida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
