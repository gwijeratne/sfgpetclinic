package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.models.Owner;
import guru.springframework.sfgpetclinic.models.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("John");
        owner1.setLastName("Jackson");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("David");
        owner2.setLastName("Dawson");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Frank");
        vet1.setLastName("Castle");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Piper");
        vet2.setLastName("Peterson");
        vetService.save(vet2);

        System.out.println("Loaded data!");


    }
}
