import org.junit.Test;
import org.springframework.stereotype.Component;

package com.myvalidation;



import com.comcast.csv.meme.Meme;
import com.comcast.csv.interview.problems.CollectionsProblemImpl;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    @Test
    public void testSort() {

    	CollectionsProblemImpl cp = new CollectionsProblemImpl();
        List<Meme> memes = new ArrayList<Meme>();
    	memes.add( new Meme("Mary", 24, null) );
    	memes.add( new Meme("Lisa", 33, null) );
    	memes.add( new Meme("Judy", 34, null) );

    	// Sort by natural order
    	Boolean ascending = true;
    	cp.sort(memes, ascending);
    	System.out.println("Sort by ascending order");
    	System.out.println("\t" + memes);

    	// Sort by reverse natural order
    	ascending = false;
    	cp.sort(memes, false);
    	System.out.println("Sort by descending order");
    	System.out.println("\t" + memes);
}
}