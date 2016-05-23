package com.comcast.csv.interview.problems;

import com.comcast.csv.meme.Meme;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Implement the specified interface.
 */
public class CollectionsProblemImpl implements CollectionsProblem {
	public int MaxArray = 1000;
	
	
	public void sort(Collection<Meme> memes, boolean ascending){
		if (ascending)
			Collections.sort( (List<Meme>) memes);
		else
			Collections.sort((List<Meme>) memes, Collections.reverseOrder());
		
	}
	
	  public void addTag(Collection<Meme> memes, String tag){
 
		  if (tag != null){
			  for (Meme meme: memes){
				  if (meme.getTags() == null){
					  String[] a = new String[MaxArray];
					  a[0] = tag;
					  meme.setTags(a);
				  } else{
					  String[] a = meme.getTags();
					  for (int i=0; i<a.length; i++){
						  if (a[i] == null){
							  a[i] = tag;
							  break;
						  }
					  }
				  }
			  }	  
		  }
	  }
}
