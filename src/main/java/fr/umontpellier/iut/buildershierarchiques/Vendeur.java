package fr.umontpellier.iut.buildershierarchiques;

public class Vendeur extends Commercial {
    private int nbUnitesVendues;

    public Vendeur(VendeurBuilder vendeurBuilder) {
        super(vendeurBuilder);
        nbUnitesVendues= vendeurBuilder.nbUnitesVendues;
    }

    public static class VendeurBuilder extends AbstractCommercialBuilder<VendeurBuilder> {
        private int nbUnitesVendues;


        public VendeurBuilder setNbUnitesVendues(int nbUnitesVendues) {
            this.nbUnitesVendues = nbUnitesVendues;
            return this;
        }


        @Override
        protected VendeurBuilder self() {
            return this;
        }

        @Override
        public Vendeur build() {
            return new Vendeur(this);
        }
    }

    public void vendreProduit() {
        System.out.println("je vends " + nbUnitesVendues+ " produits");
    }


    @Override
    public String toString() {
        return "Vendeur{" + super.toString() + "}";
    }
}
