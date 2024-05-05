import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int agencia;
        int digito;
        int conta;
        String nome = "";
        int saldo   = 2190;
        int saque   =0;
        int senha = 0;
        int novoSaldo = 0;

        //declara o scanner
        Scanner sc = new Scanner(System.in);

        //obtém o nome do cliente
        System.out.println("Seja bem vindo ao banco DIO. Informe o seu nome");
        nome = sc.nextLine().trim();
        if (checkLetters(nome))
        {
            nome = sc.nextLine().trim();
        }
        else
        {
            System.out.println("Neste campo não é permitido números. Tente Novamente.");
        }

        //obtém a agência do cliente
        System.out.println("Obrigado "+nome+" Agora por favor, informe sua Agencia");
        agencia = sc.nextInt();

        //obtém a agência do cliente
        System.out.println("Perfeito "+nome+" Agora por favor, informe a conta");
        conta = sc.nextInt();

        //obtém o digito da conta do cliente
        System.out.println("Perfeito "+nome+" Agora por favor, informe o Dígito da conta");
        digito = sc.nextInt();

        //obtém a senha da conta do cliente
        System.out.println("Perfeito "+nome+" Agora por favor, informe a Senha da conta");
        senha = sc.next().hashCode();

        //realiza o saque da conta do cliente
        System.out.println("Perfeito "+nome+" Agora por favor, informe o valor do saque. Seu saldo e: "+saldo);
        saque = sc.nextInt();

        if (saque > saldo){
            System.out.println("Operacao nao realizada. Saldo insuficiente. Seu saldo e: "+saldo);
        }else{
            System.out.println(nome);
            System.out.println(agencia);
            System.out.println(conta + " - "+ digito);
            System.out.println("Operacao realizada com sucesso!");
            novoSaldo = saldo - saque;
            System.out.println("Seu saldo é: "+novoSaldo);
        }
    }

    public static boolean checkLetters(String str)
    {
        return str.matches("[a-zA-Z]+");
    }

    public boolean hasNumbers(final String string){
        String numbers = "0123456789";
        for(char a : string.toCharArray())
            for(char b : numbers.toCharArray())
                if(a == b) return true;
        return false;
    }

    public boolean hasNumberS(final String st){
        String numbers = "0123456789";
        for(char a : st.toCharArray())
            for(char b : numbers.toCharArray())
                if(a == b) return true;
        return true;
    }


}
