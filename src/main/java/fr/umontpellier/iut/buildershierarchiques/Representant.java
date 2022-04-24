package fr.umontpellier.iut.buildershierarchiques;

public class Representant extends Commercial{

    public Representant(RepresentantBuilder representantBuilder) {
        super(representantBuilder);
    }

    public void representerEntreprise() {
        System.out.println("je represente l'entreprise aupres des clients");
    }

    public static class RepresentantBuilder extends AbstractCommercialBuilder<RepresentantBuilder> {


        @Override
        protected RepresentantBuilder self() {
            return this;
        }

        @Override
        public Representant build() {
            return new Representant(this);
        }
    }

    @Override
    public String toString() {
        return "Representant{" + super.toString() + "}";
    }
}
