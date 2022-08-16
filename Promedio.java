public class Promedio{
  public static void main(String args[]){

   int matematicas = 5;
   int biologia = 8;
   int quimica = 7;
   int promedio  = 0;

   promedio = (matematicas + biologia +  quimica) / 3;
   System.out.println("El promedio es: " + promedio);

   if (promedio >=6) {
    System.out.println("El alumno Aprobo" + promedio);
   } else {
     System.out.println("Usted esta reprobado");
   }

 }
}