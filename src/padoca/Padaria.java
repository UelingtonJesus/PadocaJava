package Padaria;

import java.util.Scanner;

public class Padaria {

    Scanner scan = new Scanner(System.in);
    private int c ;
    private String[] paes = new String[1000];
    private String[] bebidas = new String[1000];
    
    
    public Padaria() {

    }
    
    public void menu(){
        int opcao;
        do{
            System.out.println("=========PADARIA=========");
            System.out.println("0 - Encerrar o programa");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            opcao = scan.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Fim do programa");
                    break;
                case 1:
                    this.cadastrar();
                    break;
                case 2:
                    this.consultar();
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }
            
        }while(opcao != 0);
       scan.close(); 
    }
    

    private void cadastrar() {
        System.out.println("Quantos pães: ");
        c = scan.nextInt();
        for (int i = 0; i < c; i++) {
            System.out.println("Digite o tipo do pão: ");
            this.paes[i] = scan.nextLine();
            scan.nextLine();
            System.out.println("Digite a bebida: ");
            this.bebidas[i] = scan.nextLine();
        }
        
    }
    
    private void consultar(){
        for(int i = 0; i < bebidas.length; i++){
            if(this.bebidas[i] == null){
                System.out.println("Não existe registro");
                break;
            }else{
            
                System.out.println();
                System.out.println("Pão: "+ this.paes[i]);
                System.out.println("Bebidas: "+ this.bebidas[i]);
                System.out.println();
        }}
    }
    
    
    

    public String[] getPaes() {
        return paes;
    }

    public void setPaes(String[] paes) {
        this.paes = paes;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
    

}
