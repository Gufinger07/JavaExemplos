public class Poo {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fiat","Uno", 2003, 10000, 4);
        Moto m1 = new Moto("BMW", "XJ6", 2015, 5000, 180);
        Veiculo[] veiculos = { c1, m1 };

        for (Veiculo v : veiculos) {
            System.out.println(v.tipoVeiculo());
            System.out.println(v.exibir());
        }

        c1.setRodas(3);

        m1.setCilindradas(120);
        System.out.println("Tipo: " + c1.tipoVeiculo());
        System.out.println("Tipo: " + m1.tipoVeiculo());

    }

    private static abstract class Veiculo {
        public abstract String tipoVeiculo();
        private String marca;
        private String modelo;
        int ano;
        int valorDeVenda;
        int valorComprado;

        public Veiculo(String marca, String modelo, int ano, int valorComprado) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.valorComprado = valorComprado;
            this.valorDeVenda = calculaPreco();
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }
        public int getAno() {
            return ano;
        }

        public int getValorComprado() {
            return valorComprado;
        }

        public int getValorDeVenda() {
            return valorDeVenda;
        }

        public void setValorDeVenda(int valorDeVenda) {
            this.valorDeVenda = valorDeVenda;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setValorComprado(int valorComprado) {
            this.valorComprado = valorComprado;
        }

        public String exibir() {
            return "Marca: " + this.getMarca() +
                    "Modelo: " + this.getModelo() +
                    "Ano: " + this.getAno() +
                    "Valor comprado: " + this.getValorComprado() +
                    "Valor de venda: " + this.getValorDeVenda();
        }


        public int calculaPreco() {
            this.valorDeVenda = this.valorComprado - this.ano;
            return valorDeVenda;
        }
    }
    public static class Carro extends Veiculo {
       private int rodas;
        @Override
        public String tipoVeiculo() {
            return "Carro";
        }
        public Carro(String marca, String modelo, int ano, int valorComprado, int rodas) {
            super(marca, modelo, ano, valorComprado);
            this.rodas = rodas;
        }

        public int getRodas() {
            return rodas;
        }

        public void setRodas(int rodas) {
            this.rodas = rodas;
        }

        @Override
        public String exibir() {
            return super.exibir() + "\nRodas: " + this.getRodas();
        }
    }
    public static class Moto extends Veiculo {
        @Override
        public String tipoVeiculo() {
            return "Moto";
        }
        private int cilindradas;
        public Moto(String marca, String modelo, int ano, int valorComprado, int cilindradas) {
            super(marca, modelo, ano, valorComprado);
            this.cilindradas = cilindradas;
        }

        public int getCilindradas() {
            return cilindradas;
        }

        public void setCilindradas(int cilindradas) {
            this.cilindradas = cilindradas;
        }

        @Override
        public String exibir() {
            return super.exibir() + "\nCilindradas: " + this.getCilindradas();
        }
    }
}
