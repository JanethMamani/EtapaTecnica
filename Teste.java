public class Teste {
    interface AreaCalculavel {
            double calculoparaArea();
        }
    public static void main(String[] args){
        
        class Quadrado implements AreaCalculavel{
            private final int lado;
            
            public Quadrado(int lado){
                this.lado=lado;
            }
            @Override
            public double calculoparaArea(){
                return this.lado*this.lado;
            }
        }
        class Retangulo implements AreaCalculavel{
            private int largura;
            private int altura;
        
            public Retangulo(int largura,int altura){
                this.largura=largura;
                this.altura=altura;
            }
        
            public double calculoparaArea(){
                return this.largura*this.altura;
            }
        }
        
        class Circulo implements AreaCalculavel{
            private int r; //raio do circulo
        
            public Circulo(int r){
                this.r=r;
            }
        
            public double calculoparaArea(){
                return (this.r^2)*3.1415;
            }
        }
    }
}
    
