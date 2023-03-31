public class BMAtividade3 {
        public static void main(String[] args) {
            double item1 = 2.95;
            double item2 = 3.50;
            System.out.println("O Item 1 custa " + item1 + " e o Item 2 custa " + item2);

            double custoTotal = item1 + item2;
            System.out.println("O custo total dos itens é " + custoTotal);

            final double TAXA = 0.0825;
            double taxaCalculada = custoTotal * TAXA;
            System.out.println("A taxa calculada é " + taxaCalculada);

            custoTotal += taxaCalculada;
            double novoCusto = custoTotal + taxaCalculada;
            System.out.println("O novo custo é " + novoCusto);

            boolean muitoCaro = novoCusto > 10;
            System.out.println("O valor de muitoCaro é " + muitoCaro);
        }
}