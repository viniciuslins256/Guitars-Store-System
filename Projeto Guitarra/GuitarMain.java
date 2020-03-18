import java.util.*;
import Guitar.Guitar;

public class GuitarMain {

    private static List<Guitar> guitars = new ArrayList<Guitar>();

    public static void main(String[] args){

        System.out.println("\n----------------------------------\nOlá, bem vindo ao Sistema Guitar Studio! O que deseja Fazer?");
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.printf("\n1 - Ver lista de Guitarras\n2 - Adicionar Guitarra\n3 - Remover Guitarra\nDigite sua Escolha: ");
            int option = sc.nextInt();

            if(option == 1) {
                listAllGuitars();
            }

            else if(option == 2) {
                addGuitar();
            }

            else if(option == 3) {
                removeGuitar();
            }

            else {
                System.out.printf("\nDigite uma Opção Válida!\n");
            }
        }

    }

    private static int getSizeGuitars() {
        return guitars.size();
    }

    private static void addGuitar() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n-----------");
        System.out.printf("\nModelo: ");
        String model = sc.nextLine();
        System.out.printf("Fabricante: ");
        String producer = sc.nextLine();
        System.out.printf("Tipo - Acústica(0) ou Elétrica(1) : ");
        int type = sc.nextInt();
        System.out.printf("Preço: ");
        double price = sc.nextDouble();
        System.out.printf("Condição - Novo(0) ou Usado(1): ");
        int status = sc.nextInt();
        Guitar newGuitar = new Guitar(model, producer, type, price, status);
        guitars.add(newGuitar);
    }

    private static int listAllGuitars() {  
        if(getSizeGuitars() == 0) {
            System.out.printf("\n------------\nNão há nenhuma Guitarra Cadastrada no Sistema\n------------\n");
            return 0;
        }
        else {
            for(int i = 0; i < getSizeGuitars(); i++){
                System.out.printf("\n-----  Guitar " + (i+1) + " -----\n");
                System.out.println("   Modelo: " + guitars.get(i).getModel());
                System.out.println("   Fabricante: " + guitars.get(i).getProducer());
                System.out.println("   Tipo: " + guitars.get(i).getTypeString());
                System.out.printf("   Preço: R$ %.2f\n", guitars.get(i).getPrice());
                System.out.println("   Condição: " + guitars.get(i).getStatusString());
            }
            return 1;
        }
    }

    private static void removeGuitar() {
        if(listAllGuitars() == 0) {
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nQual Guitarra deseja remover? (Digite o número correspondente à guitarra): ");
        int change = sc.nextInt();
        change--;
        guitars.remove(change);
        System.out.printf("\n------------\nGuitarra " + (change+1) + " Apagada\n------------\n");
    }


}