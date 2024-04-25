public class Tv {
    
    private boolean  estadoTv ;   
    private int canal ;
    private int volume ;   


 
         public void ligarTv () {
             this.estadoTv = true ;

         } 
         public void desligarTv () {
             this.estadoTv = false ;
                } 
         public boolean estadoDaTv () {
            return estadoTv  ;
        
                 } 
         
       public void aumentarVolume () { 
           this.volume = volume +1 ;
        }
       public void abaixarVolume () { 
           this.volume = volume -1;
        }
        
       public int retornarVolume () {
           return volume ;
        }

        public void canalUp () { 
            this.canal = canal +1 ;
         }
        public void canalDown () { 
            this.canal =canal -1;
         }
         public void setCanal (int canal) {

             this. canal =canal ;
         }

         public int retornarCanal () {
            return canal;
         }
         




    
}
