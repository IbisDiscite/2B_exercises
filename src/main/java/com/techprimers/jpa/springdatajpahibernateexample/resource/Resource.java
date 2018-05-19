package com.techprimers.jpa.springdatajpahibernateexample.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class Resource {

    private ExerciseRepository exerciseRepository;

    public Resource(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }


    @GetMapping("/")
    public List<Exercises> all() {


        return exerciseRepository.findAll();
    }
    @GetMapping("/leccion/{id}")
    public  List<Exercises> leccion(@PathVariable int id){
        return exerciseRepository.getByLeccion(id);
    }

    @GetMapping("/create")
    public List<Exercises> users() {
        Exercises exercises1= new Exercises(1,"select the correct option","There is a difference.","There a is  difference.","There is a differences"," There a difference.","There is a difference.");
        Exercises exercises2= new Exercises(1,"select the correct option","it are today","it is today","it were today"," ii today","it is today");
        Exercises exercises3= new Exercises(1,"select the correct option","She are Alexis and this is Bob.","She is Alexis am this is Bob.","She is Alexis and this is Bob.","She is Alexis and this are Bob.","She is Alexis and this is Bob.");
        Exercises exercises4= new Exercises(1,"select the correct option","It is not an small cat","It is not small cat","It am not a small cat","It is not a small cat","It is not a small cat");
        Exercises exercises5= new Exercises(1,"select the correct option","Are we ready? ","We are ready? ","Are he ready? "," Are we ready","Are we ready? ");
        Exercises exercises6= new Exercises(1,"select the correct option","Am were intelligent? ","Am I intelligent? ","Am I intelligent"," Am he intelligent? ","Am I intelligent? ");
        //lesson2
        Exercises exercises7= new Exercises(2,"select the correct option","the dog eat his burguer","dog eat burguer","the dog eating the burguer"," the dog eat burguer","the dog eat  burguer");
        Exercises exercises8= new Exercises(2,"select the correct option","We play in the park every day","We plays in the park every day","We play on the park every day"," We play into the park every day","We play in the park every day");
        Exercises exercises9= new Exercises(2,"select the correct option","She is reads the newspaper yesterday","She reads the newspaper yesterday","She read the newspaper every day"," She reads newspaper every day","She reads the newspaper every day");
        Exercises exercises10= new Exercises(2,"select the correct option","The boy cry because his toy is broken","The boy cries because her toy is broken","The boy cries because his toy is broken"," The boy cries because his toy are broken","The boy cries because his toy is broken");
        Exercises exercises11= new Exercises(2,"select the correct option","We go to the movies every weekend","We going to the movies every weekend","We goes to the movies every weekend","We went to the movies every weekend","We go to the movies every weekend");
        Exercises exercises12= new Exercises(2,"select the correct option"," Does he speak at the meeting"," Does he speak at the meeting?"," Do he speak at the meeting?"," the dog eat burguer"," Does he speak at the meeting?");
        //lesson3
        Exercises exercises13= new Exercises(3,"select the correct option","What are Bella and Andrew doing?","What are doing Bella and Andrew?","What are Bella, Andrew doing?","What are Bella and Andrew doing","What are Bella and Andrew doing?");
        Exercises exercises14= new Exercises(3,"select the correct option","When is you having lunch? ","When are you had lunch? ","When are you having lunch? "," When are you has lunch? ","When are you having lunch? ");
        Exercises exercises15= new Exercises(3,"select the correct option","I am not watching the game those evening","I am not watching the game this evening","you am not watching the game this evening","I  not watching the game this evening","I am not watching the game this evening");
        Exercises exercises16= new Exercises(3,"select the correct option","He is not going  the party tonight","He are not going to the party tonightr","He is not going to the party yesterday","He is not going to the party tonight","He is not going to the party tonight");
        Exercises exercises17= new Exercises(3,"select the correct option","They  is constantly fighting.","They are constantly fighting.","They are constantly fight."," They  constantly fighting.","They are constantly fighting.");
        Exercises exercises18= new Exercises(3,"select the correct option","the end is coming","the end wos coming","the end are coming","the end  coming","the end is coming");
        //lesson4
        Exercises exercises19= new Exercises(4,"select the correct option","She did the work of two people","She did the work two people","She did the work from two people","She did was the work of two people","She did the work of two people");
        Exercises exercises20= new Exercises(4,"select the correct option","Who did your work for?","Who did you work for","Who did you work from?","When did you work for","Who did you work for?");
        Exercises exercises21= new Exercises(4,"select the correct option","I buyed this car in January","I bought this car into January","I bought this car in January"," I bought these car in January","I bought this car in January");
        Exercises exercises22= new Exercises(4,"select the correct option","It raining all night","It were rained all night","It does rained all night","It rained all night","It rained all night");
        Exercises exercises23= new Exercises(4,"select the correct option","I writed a note for you","I wrote a note for you","I wrote a note on you","I wroten a note for you","I wrote a note for you");
        Exercises exercises24= new Exercises(4,"select the correct option","I didn’t think about that, sorry!","I didn’t think about, that sorry!","I doesn’t think about that, sorry!","I didn’t think over that, sorry!","I didn’t think about that, sorry!");
        //lesson5
        Exercises exercises25= new Exercises(5,"select the correct option","Were you sleeping all night long? ","Were you sleeping night long? ","Was you sleeping all night long? ","Were you sleeping all night along? ","Were you sleeping all night long? ");
        Exercises exercises26= new Exercises(5,"I was ----- when the phone rang. The apropiate verb for this phrase is ","eated","studying","flying","wishing","studying");
        Exercises exercises27= new Exercises(5,"They were always --- fun of him. The apropiate verb for this phrase is  ","dying","making","washing","running","making");
        Exercises exercises28= new Exercises(5,"the conjugation of the verb explore in past progresive is","explored","exploring","explorating","exploration","exploring");
        Exercises exercises29= new Exercises(5,"nosotros estaremos pasando todo el dia adentro se traduce como:","We are spending all day inside","We were spending all day inside","We are spending all day outside","We as spending all day inside","We are spending all day inside");
        Exercises exercises30= new Exercises(5,"Estábamos tomando una prueba a esta hora hace dos días se traduce como:","We taking a test this time two days ago","We were taking a test time two days ago","We was taking a test this time two days ago","We were taking a test this time two days ago","We were taking a test this time two days ago");
        //lesson6
        Exercises exercises32= new Exercises(6,"Two men were arrested yesterday se traduce como:","Dos hombres fueron arrestados ayer","dog eat burguer","Dos hombres han sido arrestados ayer","Dos hombres estaban siendo arrestado ayer","Dos hombres fueron arrestados ayer");
        Exercises exercises31= new Exercises(6,"Me dio un vaso roto se traduce como:","He gave me an broken glass","She gave me a broken glass","He gave me a broken glass","He give me a broken glass","He gave me a broken glass");
        Exercises exercises33= new Exercises(6,"He has ----- a book, complete:","written","eaten","flought","sneezed","written");
        Exercises exercises34= new Exercises(6,"select the correct option","A red car was bought by John","A red car was buyed by John","A red car was bought for John","A red car were bought by John","A red car was bought by John");
        Exercises exercises35= new Exercises(6,"select the correct option","I had visited Paris beforer","I had visited Paris before","I had visiting Paris before","I had visited before","I had visited Paris before");
        Exercises exercises36= new Exercises(6,"The past participle of swim is:","swem","swam","swim"," swum","swum");
        //lesson7
        Exercises exercises37= new Exercises(7,"translate:  Nosotros vendremos a la escuela en autobús","We going to come to school by bus","We will come to school by bus","We will come to school on bus","We wil come to school by bus","We will come to school by bus");
        Exercises exercises38= new Exercises(7,"translate: She will kiss me every morning","Ella me besará cada mañana","Ella no me besará cada mañana","Ella me besó cada mañana","Ella va a besarme cada mañana","Ella me besará cada mañana");
        Exercises exercises39= new Exercises(7,"Complete: She-------- the piano","would play","gonna play"," will play","will played","the dog eat  burguer");
        Exercises exercises40= new Exercises(7,"select the correct option","They are going  spend the day together","They are going to spend the day together","They are going to spent the day together","They are going to spending the day together","They are going to spend the day together");
        Exercises exercises41= new Exercises(7,"select the correct option","I’m going to slept all day","I going to sleep all day","I going to slept all day","I’m going to sleep all day","I’m going to sleep all day");
        Exercises exercises42= new Exercises(7,"The snow will have stopped by April is a ","future imperfect","future perfect","wish","none of all","future perfect");
        //lesson8 get
        Exercises exercises43= new Exercises(8,"select the correct option","my father is get increasingliy forgetful in his old age","my father is getting increasingliy forgetful in his old age","my father will getting increasingliy forgetful in his old age","my father is getting increasingliy forgetful in her old age","my father is getting increasingliy forgetful in his old age");
        Exercises exercises44= new Exercises(8,"translate:Do you think they'll get here in time for lunch?","Crees que ellos llegaran a tiempo con el almuerzo?","Crees que ellos no llegaran a tiempo para el almuerzo?","Crees que ellos llegaran con tiempo para el almuerzo?","Crees que ellos llegaran a tiempo para el almuerzo?","Crees que ellos llegaran a tiempo para el almuerzo? ");
        Exercises exercises45= new Exercises(8,"complete: How --- I ---- you to change your mind","get,get","can, get","can,got","came,get","can, get");
        Exercises exercises46= new Exercises(8,"select the correct option","I think we should to stop playing now, it getting dark","I think we should to stop playing tomorrow, it's getting dark","I think we should to stop playing now, it's getting dark","I think we should to stop playing now, it's gotting dark","I think we should to stop playing now, it's getting dark");
        Exercises exercises47= new Exercises(8,"translate: ella va a ser atrapada, si no es cuidadosa","She's going to get caught if she's not carefull","She's going to get caught if she not carefull","She's going to get caught if she not carefull","She's going to gotten caught if she's not carefull","She's going to get caught if she's not carefull");
        Exercises exercises48= new Exercises(8,"complete: we will ----- to change all the locks","gonna","gotten","going","get","going");
        //lesson9 conditional
        Exercises exercises49= new Exercises(9,"complete: if i -----, i --- pass the exams","study,will","dream, eat","drink,do","study, dont","study,will");
        Exercises exercises50= new Exercises(9,"complete: If the sun ---- , we will walk ---- town","shines, from","shines,into","faintes,over","fails,under","shines,into");
        Exercises exercises51= new Exercises(9,"complete:-- I came home earlier, I----- prepare dinner","about, would","while, go","if,go","if,would","if,would");
        Exercises exercises52= new Exercises(9,"complete:  If Tim and Tom----- older, they ----- play in our hockey team","are,will","was,will","were,would","will,would","were,would");
        Exercises exercises53= new Exercises(9,"complete: If I met Richard, I ----- tell him ----- our new office","would,about","will,about","will,above","would,above","would,about");
        Exercises exercises54= new Exercises(9,"complete:  I ---- not stay any longer if Gerry ---- at the party","have,sang","should,sang","will, sung","will,sing","would,sang");
        //lesson10 have
        Exercises exercises55= new Exercises(10,"complete: she will ---- finished lunch in a few minutes","has","had","have","ham","have");
        Exercises exercises56= new Exercises(10,"complete: I'm ----- problems with my wifi","has","had","have","having","having");
        Exercises exercises57= new Exercises(10,"translate: Ellos han estado casados por 15 años","They has been married for 15 years","They've been married for 15 years","They'd been married for 15 years","They've been married for 1 years","They've been married for 15 years");
        Exercises exercises58= new Exercises(10,"translate: tienes algo de dinero contigo?","Does you have any money with you?","Do you have any money on you?","Dont you have any money with you?","You do have any money with you?","Do you have any money on you?");
        Exercises exercises59= new Exercises(10,"complete: where do you have your hair cut?","has","had","have","ham","have");


        exerciseRepository.save(exercises1);
        exerciseRepository.save(exercises2);
        exerciseRepository.save(exercises3);
        exerciseRepository.save(exercises4);
        exerciseRepository.save(exercises5);
        exerciseRepository.save(exercises6);
        exerciseRepository.save(exercises7);
        exerciseRepository.save(exercises8);
        exerciseRepository.save(exercises9);
        exerciseRepository.save(exercises10);
        exerciseRepository.save(exercises11);
        exerciseRepository.save(exercises12);
        exerciseRepository.save(exercises13);
        exerciseRepository.save(exercises14);
        exerciseRepository.save(exercises15);
        exerciseRepository.save(exercises16);
        exerciseRepository.save(exercises17);
        exerciseRepository.save(exercises18);
        exerciseRepository.save(exercises19);
        exerciseRepository.save(exercises20);
        exerciseRepository.save(exercises21);
        exerciseRepository.save(exercises22);
        exerciseRepository.save(exercises23);
        exerciseRepository.save(exercises24);
        exerciseRepository.save(exercises25);
        exerciseRepository.save(exercises26);
        exerciseRepository.save(exercises27);
        exerciseRepository.save(exercises28);
        exerciseRepository.save(exercises29);
        exerciseRepository.save(exercises30);
        exerciseRepository.save(exercises31);
        exerciseRepository.save(exercises32);
        exerciseRepository.save(exercises33);
        exerciseRepository.save(exercises34);
        exerciseRepository.save(exercises35);
        exerciseRepository.save(exercises36);
        exerciseRepository.save(exercises37);
        exerciseRepository.save(exercises38);
        exerciseRepository.save(exercises39);
        exerciseRepository.save(exercises40);
        exerciseRepository.save(exercises41);
        exerciseRepository.save(exercises42);
        exerciseRepository.save(exercises43);
        exerciseRepository.save(exercises44);
        exerciseRepository.save(exercises45);
        exerciseRepository.save(exercises46);
        exerciseRepository.save(exercises47);
        exerciseRepository.save(exercises48);
        exerciseRepository.save(exercises49);
        exerciseRepository.save(exercises50);
        exerciseRepository.save(exercises51);
        exerciseRepository.save(exercises52);
        exerciseRepository.save(exercises53);
        exerciseRepository.save(exercises54);
        exerciseRepository.save(exercises55);
        exerciseRepository.save(exercises56);
        exerciseRepository.save(exercises57);
        exerciseRepository.save(exercises58);
        exerciseRepository.save(exercises59);
        return exerciseRepository.findAll();
    }
}
