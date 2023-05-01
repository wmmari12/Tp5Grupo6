//GRUPO 6
//INTEGRANTES
//FALCON EMILIANO
//FERNANDEZ LUCAS
//FLORES MARIANA 


package tp5grupo6;


public class Arreglo {
    
   
    
    public static void  sumarLista(int arreglo[]){
        
        int suma=0;
        for (int i = 0; i < arreglo.length; i++)
        {
            suma+=arreglo[i];
        }
        System.out.println("La suma de los elementos es: "+suma);
        System.out.println("El promedio de los elementos es: "+(suma/arreglo.length));
    }
    
    public static void  sumarMayor(int arreglo[][]){
        
        int mayor=arreglo[0][0];
        for (int i = 0; i < arreglo.length; i++)
        {
            
            for (int j = 0; j < arreglo[i].length; j++)
            {
                if(mayor<arreglo[i][j]){
                    mayor=arreglo[i][j];
                }
            }
        }
        System.out.println("el mayor numero ingresado es: "+mayor);
    }
    
    public static void cuentaVocales(String palabra){
        int contador=0;
        for (int i = 0; i < palabra.length(); i++)
        {
            char a=palabra.charAt(i);
            if(a=='a'||a=='e'||a=='i'|| a=='o'||a=='u'){
               contador+=1;
            }
        }
        System.out.println("La palabra ingresada tiene "+contador+" vocales.");
    }
    
    public static void cuentaCaracter(String palabra,char letra){
        int contador=0;
        for (int i = 0; i < palabra.length(); i++)
        {
            char a=palabra.charAt(i);
            if(a==letra){
               contador+=1;
            }
        }
        System.out.println("La palabra tiene "+contador+" letras "+letra);
    }
    
}
