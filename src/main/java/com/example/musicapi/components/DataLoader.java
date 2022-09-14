package com.example.musicapi.components;

import com.example.musicapi.models.*;
import com.example.musicapi.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    PlaylistRepository playlistRepository;

    @Autowired
    TrackRepository trackRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Artist milesDavis = new Artist("Miles Davis", Genre.JAZZ);
        artistRepository.save(milesDavis);
        Track track1 = new Track("Bags' Groove", milesDavis, Genre.JAZZ, 3.00);
        Track track2 = new Track("Bags' Groove - Take 2", milesDavis, Genre.JAZZ, 3.00);
        Track track3 = new Track("Airegin", milesDavis, Genre.JAZZ, 3.00);
        Track track4 = new Track("Oleo", milesDavis, Genre.JAZZ, 3.00);
        Track track5 = new Track("But Not For Me", milesDavis, Genre.JAZZ, 3.00);
        Track track6 = new Track("Doxy", milesDavis, Genre.JAZZ, 3.00);
        Track track7 = new Track("But Not For Me", milesDavis, Genre.JAZZ, 3.00);

        Album bagsGroove = new Album("Bags' Groove", milesDavis, 1957 ,Genre.JAZZ);
        bagsGroove.getTracks().add(track1);
        bagsGroove.getTracks().add(track2);
        bagsGroove.getTracks().add(track3);
        bagsGroove.getTracks().add(track4);
        bagsGroove.getTracks().add(track5);
        bagsGroove.getTracks().add(track6);
        bagsGroove.getTracks().add(track7);
        trackRepository.save(track1);
        trackRepository.save(track2);
        trackRepository.save(track3);
        trackRepository.save(track4);
        trackRepository.save(track5);
        trackRepository.save(track6);
        trackRepository.save(track7);
        albumRepository.save(bagsGroove);

        Artist pinkFloyd = new Artist("Pink Floyd", Genre.ROCK);
        artistRepository.save(pinkFloyd);
        Track track8 = new Track("Speak To Me / Breathe", pinkFloyd, Genre.ROCK, 4.00);
        Track track9 = new Track("On The Run", pinkFloyd, Genre.ROCK, 4.00);
        Track track10 = new Track("Time", pinkFloyd, Genre.ROCK, 4.00);
        Track track11 = new Track("The Great Gig In The Sky", pinkFloyd, Genre.ROCK, 4.00);
        Track track12 = new Track("Money", pinkFloyd, Genre.ROCK, 4.00);
        Track track13 = new Track("Us And Them", pinkFloyd, Genre.ROCK, 4.00);
        Track track14 = new Track("Any Colour You Like", pinkFloyd, Genre.ROCK, 4.00);
        Track track15 = new Track("Brain Damage", pinkFloyd, Genre.ROCK, 4.00);
        Track track16 = new Track("Eclipse", pinkFloyd, Genre.ROCK, 4.00);

        Album theDarkSideOfTheMoon = new Album("The Dark Side Of The Moon", pinkFloyd, 1973, Genre.ROCK);
        theDarkSideOfTheMoon.getTracks().add(track8);
        theDarkSideOfTheMoon.getTracks().add(track9);
        theDarkSideOfTheMoon.getTracks().add(track10);
        theDarkSideOfTheMoon.getTracks().add(track11);
        theDarkSideOfTheMoon.getTracks().add(track12);
        theDarkSideOfTheMoon.getTracks().add(track13);
        theDarkSideOfTheMoon.getTracks().add(track14);
        theDarkSideOfTheMoon.getTracks().add(track15);
        theDarkSideOfTheMoon.getTracks().add(track16);
        trackRepository.save(track8);
        trackRepository.save(track9);
        trackRepository.save(track10);
        trackRepository.save(track11);
        trackRepository.save(track12);
        trackRepository.save(track13);
        trackRepository.save(track14);
        trackRepository.save(track15);
        trackRepository.save(track16);
        albumRepository.save(theDarkSideOfTheMoon);

        Artist bbKing = new Artist("B. B. King", Genre.BLUES);
        artistRepository.save(bbKing);
        Track track17 = new Track("Introduction", bbKing, Genre.BLUES, 4.00);
        Track track18 = new Track("Everyday I Have The Blues", bbKing, Genre.BLUES, 4.00);
        Track track19 = new Track("How Blue Can You Get", bbKing, Genre.BLUES, 4.00);
        Track track20 = new Track("Worry, worry", bbKing, Genre.BLUES, 4.00);
        Track track21 = new Track("3 O'Clock Blues / Darlin' You Know I Love You", bbKing, Genre.BLUES, 4.00);
        Track track22 = new Track("Sweet Sixteen", bbKing, Genre.BLUES, 4.00);
        Track track23 = new Track("The Thrill Has Gone", bbKing, Genre.BLUES, 4.00);
        Track track24 = new Track("Please Accept My Love", bbKing, Genre.BLUES, 4.00);

        Album liveInCookCountyJail = new Album("Live In Cook County Jail", bbKing, 1971, Genre.BLUES);
        liveInCookCountyJail.getTracks().add(track17);
        liveInCookCountyJail.getTracks().add(track18);
        liveInCookCountyJail.getTracks().add(track19);
        liveInCookCountyJail.getTracks().add(track20);
        liveInCookCountyJail.getTracks().add(track21);
        liveInCookCountyJail.getTracks().add(track22);
        liveInCookCountyJail.getTracks().add(track23);
        liveInCookCountyJail.getTracks().add(track24);
        trackRepository.save(track17);
        trackRepository.save(track18);
        trackRepository.save(track19);
        trackRepository.save(track20);
        trackRepository.save(track21);
        trackRepository.save(track22);
        trackRepository.save(track23);
        trackRepository.save(track24);
        albumRepository.save(liveInCookCountyJail);

        Artist dollyParton = new Artist("Dolly Parton", Genre.COUNTRY);
        artistRepository.save(dollyParton);
        Track track25 = new Track("Star of the Show", dollyParton, Genre.COUNTRY, 3.56);
        Track track26 = new Track("Down", dollyParton, Genre.COUNTRY,3.35);
        Track track27 = new Track("You're The Only One", dollyParton, Genre.COUNTRY, 3.21);
        Track track28 = new Track("Help", dollyParton, Genre.COUNTRY,2.45);
        Track track29 = new Track("Do You Think That Time Stands Still?", dollyParton, Genre.COUNTRY,3.56);
        Track track30 = new Track("Sweet Summer Lovin'", dollyParton, Genre.COUNTRY,3.17);
        Track track31 = new Track("Great Balls of Fire", dollyParton, Genre.COUNTRY,3.51);
        Track track32 = new Track("Almost in Love", dollyParton, Genre.COUNTRY,3.16);
        Track track33 = new Track("It's Not My Affair Anymore", dollyParton, Genre.COUNTRY,3.17);
        Track track34 = new Track("Sandy's Song", dollyParton, Genre.COUNTRY,3.19);

        Album greatBallsOfFire = new Album("Great Balls of Fire", dollyParton, 1979, Genre.COUNTRY);
        greatBallsOfFire.getTracks().add(track25);
        greatBallsOfFire.getTracks().add(track26);
        greatBallsOfFire.getTracks().add(track27);
        greatBallsOfFire.getTracks().add(track28);
        greatBallsOfFire.getTracks().add(track29);
        greatBallsOfFire.getTracks().add(track30);
        greatBallsOfFire.getTracks().add(track31);
        greatBallsOfFire.getTracks().add(track32);
        greatBallsOfFire.getTracks().add(track33);
        greatBallsOfFire.getTracks().add(track34);
        trackRepository.save(track25);
        trackRepository.save(track26);
        trackRepository.save(track27);
        trackRepository.save(track28);
        trackRepository.save(track29);
        trackRepository.save(track30);
        trackRepository.save(track31);
        trackRepository.save(track32);
        trackRepository.save(track33);
        trackRepository.save(track34);
        albumRepository.save(greatBallsOfFire);

        Artist philipGlass = new Artist("Philip Glass", Genre.CLASSICAL);
        artistRepository.save(philipGlass);
        Track track35 = new Track("Opening", philipGlass, Genre.CLASSICAL, 6.24);
        Track track36 = new Track("Floe", philipGlass, Genre.CLASSICAL, 5.59);
        Track track37 = new Track("Island", philipGlass, Genre.CLASSICAL, 7.39);
        Track track38 = new Track("Rubric", philipGlass, Genre.CLASSICAL,6.04);
        Track track39 = new Track("Facades", philipGlass, Genre.CLASSICAL, 7.20);
        Track track40 = new Track("Closing", philipGlass, Genre.CLASSICAL,6.03);

        Album glassworks = new Album("Glassworks", philipGlass, 1981, Genre.CLASSICAL);
        glassworks.getTracks().add(track35);
        glassworks.getTracks().add(track36);
        glassworks.getTracks().add(track37);
        glassworks.getTracks().add(track38);
        glassworks.getTracks().add(track39);
        glassworks.getTracks().add(track40);
        trackRepository.save(track35);
        trackRepository.save(track36);
        trackRepository.save(track37);
        trackRepository.save(track38);
        trackRepository.save(track39);
        trackRepository.save(track40);
        albumRepository.save(glassworks);

        Artist skeeMask = new Artist("Skee Mask", Genre.ELECTRONIC);
        Track track41 = new Track("Cerroverb", skeeMask, Genre.ELECTRONIC, 5.34);
        Track track42 = new Track("Session Add", skeeMask, Genre.ELECTRONIC, 6.20);
        Track track43 = new Track("Rev8617", skeeMask, Genre.ELECTRONIC, 3.44);
        Track track44 = new Track("50 Euro to Break Boost", skeeMask, Genre.ELECTRONIC, 5.07);
        Track track45 = new Track("Via Sub Mids", skeeMask, Genre.ELECTRONIC, 6.33);
        Track track46 = new Track("Soundboy Ext.", skeeMask, Genre.ELECTRONIC, 4.51);
        Track track47 = new Track("Dial 274", skeeMask, Genre.ELECTRONIC, 6.06);
        Track track48 = new Track("Vli", skeeMask, Genre.ELECTRONIC, 5.55);
        Track track49 = new Track("Flyby Vfr", skeeMask, Genre.ELECTRONIC, 5.29);

        Album compro = new Album("Compro", skeeMask, 2018, Genre.ELECTRONIC);
        compro.getTracks().add(track41);
        compro.getTracks().add(track42);
        compro.getTracks().add(track43);
        compro.getTracks().add(track44);
        compro.getTracks().add(track45);
        compro.getTracks().add(track46);
        compro.getTracks().add(track47);
        compro.getTracks().add(track48);
        compro.getTracks().add(track49);

        Artist thePharcyde = new Artist("The Pharcyde", Genre.HIPHOP);
        Track track50 = new Track("Bull****", thePharcyde, Genre.HIPHOP, 4.12);
        Track track51 = new Track("Pharcyde", thePharcyde, Genre.HIPHOP, 4.20);
        Track track52 = new Track("Groupie Therapy", thePharcyde, Genre.HIPHOP, 5.12);
        Track track53 = new Track("Runnin'", thePharcyde, Genre.HIPHOP, 4.56);
        Track track54 = new Track("She Said", thePharcyde, Genre.HIPHOP, 5.15);
        Track track55 = new Track("Splattitorium", thePharcyde, Genre.HIPHOP, 2.58);
        Track track56 = new Track("Somethin' That Means Somethin'", thePharcyde, Genre.HIPHOP, 3.31);
        Track track57 = new Track("Drop", thePharcyde, Genre.HIPHOP, 5.35);
        Track track58 = new Track("Hey You", thePharcyde, Genre.HIPHOP, 3.54);
        Track track59 = new Track("Y?", thePharcyde, Genre.HIPHOP, 5.04);
        Track track60 = new Track("Moment In Time", thePharcyde, Genre.HIPHOP, 2.44);
        Track track61 = new Track("The Hustle", thePharcyde, Genre.HIPHOP, 5.34);
        Track track62 = new Track("Devil Music", thePharcyde, Genre.HIPHOP, 4.12);
        Track track63 = new Track("The E.N.D", thePharcyde, Genre.HIPHOP, 4.41);

        Album labcabincalifornia = new Album("Labcabincalifornia", thePharcyde, 1995, Genre.HIPHOP);
        labcabincalifornia.getTracks().add(track50);
        labcabincalifornia.getTracks().add(track51);
        labcabincalifornia.getTracks().add(track52);
        labcabincalifornia.getTracks().add(track53);
        labcabincalifornia.getTracks().add(track54);
        labcabincalifornia.getTracks().add(track55);
        labcabincalifornia.getTracks().add(track56);
        labcabincalifornia.getTracks().add(track57);
        labcabincalifornia.getTracks().add(track58);
        labcabincalifornia.getTracks().add(track59);
        labcabincalifornia.getTracks().add(track60);
        labcabincalifornia.getTracks().add(track61);
        labcabincalifornia.getTracks().add(track62);
        labcabincalifornia.getTracks().add(track63);

        Artist eyehategod = new Artist("Eyehategod", Genre.METAL);
        Track track64 = new Track("Blank", eyehategod, Genre.METAL, 7.10);
        Track track65 = new Track("Shop Lift", eyehategod, Genre.METAL, 3.17);
        Track track66 = new Track("30$ Bag", eyehategod, Genre.METAL, 2.51);
        Track track67 = new Track("Disturbance", eyehategod, Genre.METAL, 7.02);
        Track track68 = new Track("Take as Needed for Pain", eyehategod, Genre.METAL, 6.09);
        Track track69 = new Track("Crimes Against Skin", eyehategod, Genre.METAL, 6.49);
        Track track70 = new Track("Kill Your Boss", eyehategod, Genre.METAL, 4.14);
        Track track71 = new Track("Who Gave Her the Roses", eyehategod, Genre.METAL, 2.00);
        Track track72 = new Track("Laugh It Off", eyehategod, Genre.METAL, 1.33);

        Album takeAsNeededForPain = new Album("Take As Needed For Pain", eyehategod, 1993, Genre.METAL);
        takeAsNeededForPain.getTracks().add(track64);
        takeAsNeededForPain.getTracks().add(track65);
        takeAsNeededForPain.getTracks().add(track66);
        takeAsNeededForPain.getTracks().add(track67);
        takeAsNeededForPain.getTracks().add(track68);
        takeAsNeededForPain.getTracks().add(track69);
        takeAsNeededForPain.getTracks().add(track70);
        takeAsNeededForPain.getTracks().add(track71);
        takeAsNeededForPain.getTracks().add(track72);

        Artist nirvana = new Artist("Nirvana", Genre.ALTERNATIVE);
        Track track73 = new Track("Smells Like Teen Spirit", nirvana, Genre.ALTERNATIVE, 5.01);
        Track track74 = new Track("In Bloom", nirvana, Genre.ALTERNATIVE, 4.15);
        Track track75 = new Track("Come as You Are", nirvana, Genre.ALTERNATIVE, 3.39);
        Track track76 = new Track("Breed", nirvana, Genre.ALTERNATIVE, 3.04);
        Track track77 = new Track("Lithium (LP version)", nirvana, Genre.ALTERNATIVE, 4.17);
        Track track78 = new Track("Polly", nirvana, Genre.ALTERNATIVE, 2.57);
        Track track79 = new Track("Territorial Pissings", nirvana, Genre.ALTERNATIVE, 2.23);
        Track track80 = new Track("Drain You (LP version)", nirvana, Genre.ALTERNATIVE, 3.44);
        Track track81 = new Track("Lounge Act", nirvana, Genre.ALTERNATIVE, 2.37);
        Track track82 = new Track("Stay Away", nirvana, Genre.ALTERNATIVE, 3.32);
        Track track83 = new Track("On a Plain", nirvana, Genre.ALTERNATIVE, 3.16);
        Track track84 = new Track("Something in the Way", nirvana, Genre.ALTERNATIVE, 3.52);

        Album nevermind = new Album("Nevermind", nirvana, 1991, Genre.ALTERNATIVE);
        nevermind.getTracks().add(track73);
        nevermind.getTracks().add(track74);
        nevermind.getTracks().add(track75);
        nevermind.getTracks().add(track76);
        nevermind.getTracks().add(track77);
        nevermind.getTracks().add(track78);
        nevermind.getTracks().add(track79);
        nevermind.getTracks().add(track80);
        nevermind.getTracks().add(track81);
        nevermind.getTracks().add(track82);
        nevermind.getTracks().add(track83);
        nevermind.getTracks().add(track84);

        Artist otisRedding = new Artist("Otis Redding", Genre.SOUL);
        Track track85 = new Track("(Sittin' On) The Dock of the Bay", otisRedding, Genre.SOUL,2.38);
        Track track86 = new Track("I Love You More Than Words Can Say", otisRedding, Genre.SOUL,2.50);
        Track track87 = new Track("Let Me Come on Home", otisRedding, Genre.SOUL,2.53);
        Track track88 = new Track("Open the Door", otisRedding, Genre.SOUL,2.21);
        Track track89 = new Track("Don't Mess with Cupid", otisRedding, Genre.SOUL,2.28);
        Track track90 = new Track("The Glory of Love", otisRedding, Genre.SOUL,2.38);
        Track track91 = new Track("I'm Coming Home", otisRedding, Genre.SOUL,3.03);
        Track track92 = new Track("Tramp", otisRedding, Genre.SOUL,2.32);
        Track track93 = new Track("The Huckle-Buck", otisRedding, Genre.SOUL,2.58);
        Track track94 = new Track("Nobody Knows You (When You're Down and Out)", otisRedding, Genre.SOUL,3.10);
        Track track95 = new Track("Ole Man Trouble", otisRedding, Genre.SOUL,2.36);

        Album theDockOfTheBay = new Album("The Dock of the Bay",otisRedding,1968,Genre.SOUL);
        theDockOfTheBay.getTracks().add(track85);
        theDockOfTheBay.getTracks().add(track86);
        theDockOfTheBay.getTracks().add(track87);
        theDockOfTheBay.getTracks().add(track88);
        theDockOfTheBay.getTracks().add(track89);
        theDockOfTheBay.getTracks().add(track90);
        theDockOfTheBay.getTracks().add(track91);
        theDockOfTheBay.getTracks().add(track92);
        theDockOfTheBay.getTracks().add(track93);
        theDockOfTheBay.getTracks().add(track94);
        theDockOfTheBay.getTracks().add(track95);

        Artist frankOcean = new Artist("Frank Ocean", Genre.RNB);
        Track track96 = new Track("Nikes",frankOcean,Genre.RNB,5.14);
        Track track97 = new Track("Ivy",frankOcean,Genre.RNB,4.09);
        Track track98 = new Track("Pink + White",frankOcean,Genre.RNB,3.04);
        Track track99 = new Track("Be Yourself",frankOcean,Genre.RNB,1.26);
        Track track100 = new Track("Solo",frankOcean,Genre.RNB,4.17);
        Track track101 = new Track("Skyline To",frankOcean,Genre.RNB,3.04);
        Track track102 = new Track("Self Control",frankOcean,Genre.RNB,4.09);
        Track track103 = new Track("Good Guy",frankOcean,Genre.RNB,1.06);
        Track track104 = new Track("Nights",frankOcean,Genre.RNB,5.07);
        Track track105 = new Track("Solo (Reprise)",frankOcean,Genre.RNB,1.18);
        Track track106 = new Track("Pretty Sweet",frankOcean,Genre.RNB,2.37);
        Track track107 = new Track("Facebook Story",frankOcean,Genre.RNB,1.08);
        Track track108 = new Track("Close To You",frankOcean,Genre.RNB,1.25);
        Track track109 = new Track("White Ferrari",frankOcean,Genre.RNB,4.08);
        Track track110 = new Track("Seigfried",frankOcean,Genre.RNB,5.34);
        Track track111 = new Track("Godspeed",frankOcean,Genre.RNB,2.57);
        Track track112 = new Track("Futura Free",frankOcean,Genre.RNB,9.24);

        Album blonde = new Album("Blonde", frankOcean, 2016,Genre.RNB);
        blonde.getTracks().add(track96);
        blonde.getTracks().add(track97);
        blonde.getTracks().add(track98);
        blonde.getTracks().add(track99);
        blonde.getTracks().add(track100);
        blonde.getTracks().add(track101);
        blonde.getTracks().add(track102);
        blonde.getTracks().add(track103);
        blonde.getTracks().add(track104);
        blonde.getTracks().add(track105);
        blonde.getTracks().add(track106);
        blonde.getTracks().add(track107);
        blonde.getTracks().add(track108);
        blonde.getTracks().add(track109);
        blonde.getTracks().add(track110);
        blonde.getTracks().add(track111);
        blonde.getTracks().add(track112);

        Artist bobDylan = new Artist("Bob Dylan", Genre.FOLK);
        Track track113 = new Track("Subterranean Homesick Blues", bobDylan, Genre.FOLK, 2.21);
        Track track114 = new Track("She Belongs to Me", bobDylan, Genre.FOLK, 2.47);
        Track track115 = new Track("Maggie's Farm", bobDylan, Genre.FOLK, 3.54);
        Track track116 = new Track("Love Minus Zero/No Limit", bobDylan, Genre.FOLK, 2.51);
        Track track117 = new Track("Outlaw Blues", bobDylan, Genre.FOLK, 3.05);
        Track track118 = new Track("On the Road Again", bobDylan, Genre.FOLK, 2.35);
        Track track119 = new Track("Bob Dylan's 115th Dream", bobDylan, Genre.FOLK, 6.30);
        Track track120 = new Track("Mr. Tambourine Man", bobDylan, Genre.FOLK, 5.30);
        Track track121 = new Track("Gates of Eden", bobDylan, Genre.FOLK, 5.40);
        Track track122 = new Track("It's Alright, Ma (I'm Only Bleeding)", bobDylan, Genre.FOLK, 7.29);
        Track track123 = new Track("It's All Over Now, Baby Blue", bobDylan, Genre.FOLK, 4.12);

        Album bringingItAllBackHome = new Album("Bringing It All Back Home",bobDylan,1965,Genre.FOLK);
        bringingItAllBackHome.getTracks().add(track113);
        bringingItAllBackHome.getTracks().add(track114);
        bringingItAllBackHome.getTracks().add(track115);
        bringingItAllBackHome.getTracks().add(track116);
        bringingItAllBackHome.getTracks().add(track117);
        bringingItAllBackHome.getTracks().add(track118);
        bringingItAllBackHome.getTracks().add(track119);
        bringingItAllBackHome.getTracks().add(track120);
        bringingItAllBackHome.getTracks().add(track121);
        bringingItAllBackHome.getTracks().add(track122);
        bringingItAllBackHome.getTracks().add(track123);

        Artist theBeatles = new Artist("The Beatles", Genre.POP);
        Track track124 = new Track("Taxman", theBeatles, Genre.POP, 2.39);
        Track track125 = new Track("Eleanor Rigby", theBeatles, Genre.POP, 2.10);
        Track track126 = new Track("I'm Only Sleeping", theBeatles, Genre.POP, 3.02);
        Track track127 = new Track("Love You To", theBeatles, Genre.POP, 3.03);
        Track track128 = new Track("Here, There and Everywhere", theBeatles, Genre.POP, 2.26);
        Track track129 = new Track("Yellow Submarine", theBeatles, Genre.POP, 2.40);
        Track track130 = new Track("She Said She Said", theBeatles, Genre.POP, 2.39);
        Track track131 = new Track("Good Day Sunshine", theBeatles, Genre.POP, 2.10);
        Track track132 = new Track("And Your Bird Can Sing", theBeatles, Genre.POP, 2.02);
        Track track133 = new Track("For No One", theBeatles, Genre.POP, 2.02);
        Track track134 = new Track("Doctor Robert", theBeatles, Genre.POP, 2.17);
        Track track135 = new Track("I Want to Tell You", theBeatles, Genre.POP, 2.32);
        Track track136 = new Track("Got to Get You Into My Life", theBeatles, Genre.POP, 2.33);
        Track track137 = new Track("Tomorrow Never Knows", theBeatles, Genre.POP, 2.58);

        Album revolver = new Album("Revolver", theBeatles, 1966, Genre.POP);
        revolver.getTracks().add(track124);
        revolver.getTracks().add(track125);
        revolver.getTracks().add(track126);
        revolver.getTracks().add(track127);
        revolver.getTracks().add(track128);
        revolver.getTracks().add(track129);
        revolver.getTracks().add(track130);
        revolver.getTracks().add(track131);
        revolver.getTracks().add(track132);
        revolver.getTracks().add(track133);
        revolver.getTracks().add(track134);
        revolver.getTracks().add(track135);
        revolver.getTracks().add(track136);
        revolver.getTracks().add(track137);

        Artist markRonson = new Artist("Mark Ronson", Genre.FUNK);
        Track track138 = new Track("Uptown's First Finale", markRonson, Genre.FUNK, 1.39);
        Track track139 = new Track("Summer Breaking", markRonson, Genre.FUNK, 3.07);
        Track track140 = new Track("Feel Right", markRonson, Genre.FUNK, 3.43);
        Track track141 = new Track("Uptown Funk", markRonson, Genre.FUNK, 4.30);
        Track track142 = new Track("I Can't Lose", markRonson, Genre.FUNK, 3.17);
        Track track143 = new Track("Daffodils", markRonson, Genre.FUNK, 4.58);
        Track track144 = new Track("Crack In The Pearl", markRonson, Genre.FUNK, 2.26);
        Track track145 = new Track("In Case of Fire", markRonson, Genre.FUNK, 4.34);
        Track track146 = new Track("Leaving Los Feliz", markRonson, Genre.FUNK, 4.19);
        Track track147 = new Track("Heavy and Rolling", markRonson, Genre.FUNK, 3.58);
        Track track148 = new Track("Crack In the Pearl, Pt. II", markRonson, Genre.FUNK, 2.16);

        Album uptownSpecial = new Album("Uptown Special", markRonson, 1966, Genre.FUNK);
        uptownSpecial.getTracks().add(track138);
        uptownSpecial.getTracks().add(track139);
        uptownSpecial.getTracks().add(track140);
        uptownSpecial.getTracks().add(track141);
        uptownSpecial.getTracks().add(track142);
        uptownSpecial.getTracks().add(track143);
        uptownSpecial.getTracks().add(track144);
        uptownSpecial.getTracks().add(track145);
        uptownSpecial.getTracks().add(track146);
        uptownSpecial.getTracks().add(track147);
        uptownSpecial.getTracks().add(track148);

        User faizan = new User("fk");
        User hasmeet = new User("hk");
        User joao = new User("jp");
        User milo = new User("mc");

        joao.getFavouriteArtists().add(milesDavis);
        joao.getFavouriteTracks().add(track8);
        joao.getFavouriteTracks().add(track9);
        joao.getFavouriteTracks().add(track10);
        joao.getFavouriteTracks().add(track11);
        joao.getFavouriteTracks().add(track12);
        joao.getFavouriteTracks().add(track13);
        joao.getFavouriteTracks().add(track14);
        joao.getFavouriteTracks().add(track15);
        joao.getFavouriteTracks().add(track16);

        joao.getFavouriteAlbums().add(liveInCookCountyJail);

        Playlist hasmeetsPlaylist = new Playlist("Hasmeet's favourites", hasmeet);
        hasmeetsPlaylist.getTracks().add(track3);
        hasmeetsPlaylist.getTracks().add(track4);
        hasmeetsPlaylist.getTracks().add(track5);
        hasmeetsPlaylist.getTracks().add(track6);
        hasmeetsPlaylist.getTracks().add(track7);
        hasmeetsPlaylist.getTracks().add(track8);

        userRepository.save(faizan);
        userRepository.save(hasmeet);
        userRepository.save(joao);
        userRepository.save(milo);

        playlistRepository.save(hasmeetsPlaylist);
    }
}


