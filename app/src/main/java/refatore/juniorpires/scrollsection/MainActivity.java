package refatore.juniorpires.scrollsection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String[] bands={"AC/DC","Adam and the Ants","Aerosmith","Afrika Bambaataa",
            "Al Foster","Al Green","Alan Parsons","Alice Cooper","Amy Winehouse","Animals","Annie Lennox",
            "Arctic Monkeys","Atmosphere","Audioslave","Babyshambles","Bat For Lashes","Bauhaus",
            "BB King","Beastie Boys","Beck","Beyonce"
            ,"Biffy Clyro","Bob Dylan","Bob Marley","Boomtown Rats","Brian Wilson","Bruce Springsteen",
            "Chic","Chris Isaak","Chuck Berry","Cliff Richard","Cliff Richard and the Shadows","Coldplay",
            "Cranberries","David Bowie","Don Williams","Dr. Feelgood","Duffy","Duke Ellington","Elton John",
            "Elvis Costello","Elvis Presley","Eric Clapton","Florence and the Machine","Foo Fighters",
            "Frank Sinatra","Grace Jones","Green Day","Guns n Roses","Happy Mondays","Herbie Hancock",
            "Horace Silver","Hugh Masekela","Humble Pie","Ian Brown","Ian Dury","Ian McCulloch","Iggy Pop",
            "Jackson Scott","James Brown","Janis Joplin","Jimi Hendrix","Jimmy Rushing","Joe Strummer",
            "John Lennon","John Lydon","Johnny Borrell","Johnny Cash", "Kaiser Cheifs",
            "Kings of Leon", "Kiss","Lady Gaga","Led Zeppelin","Lee 'Scratch' Perry","Lenny Kravitz",
            "Libertines","Lily Allen","Louis Armstrong","Madness","Madonna","Manic Street Preachers",
            "Marilyn Manson","Marvin Gaye","Metallica","Michael Jackson","Motorhead","My Chemical Romance",
            "Neil Young","Nick Cave","Nigel Kennedy","Nina Simone","Nirvana","Noisettes","Oasis",
            "Offspring","Ozzy Osbourne", "Paul McCartney","Paul Simon","Paul Weller","Pearl Jam",
            "Pendulum","Performance Boxset","Pete Burns","Pete Doherty","Pete Townshend","Peter Gabriel",
            "Pink Floyd","Prince","Queen","Radiohead","Razorlight","Red Hot Chili Peppers",
            "REM","Richard Ashcroft","Scissor Sisters","Sex Pistols","The Beatles","The Cure",
            "The Doors","The Killers","The Pet Shop Boys","The Police","The Pretenders","The Ramones",
            "The Revillos","The Rolling Stones","The Tourists","The Undertones","The Who","Tina Turner",
            "Toots and the Maytals","Trevor Moss and Hannah Lou","TV on the Radio","U2","Van Morrison",
            "Velvet Revolver","White Stripes","Wishbone Ash","Wreckless Eric","Wu-Tang Clan","Yoko Ono",
            "Yumi Matsutoya"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewItems = (ListView) this.findViewById(R.id.listView);

        List<String> bandList = Arrays.asList(bands);
        Collections.sort(bandList);

        listViewItems.setAdapter(new SectionListAdapter(this,bandList));
    }


}
