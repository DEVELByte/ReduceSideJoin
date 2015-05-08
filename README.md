Reduce Side Join
==============================

MapReduce program to Implement Reduce side joining technique.


##Data set Description:
The Book-Crossing dataset consists of 2 tables.

##BX-Books:
It gives us the details about the book such as Book-Title, Book-Author, Year-Of-Publication,
Publisher, Image-URL and ISBN. Here ISBN will act as a unique code for a book. Invalid ISBNs
have already been removed from the dataset. URLs linking to cover images are also given, appearing
in three different flavors (`Image-URL-S`, `Image-URL-M`, `Image-URL-L`) i.e.  small, medium, large.
These URLs point to the Amazon web site.

#BX-Book-Ratings:
It contains the book rating information. Ratings are either explicitly expressed on a scale from 1-10
(higher values denoting higher appreciation) or implicitly expressed by 0.

##Goal:
*	To find out how many book were published each year based on ranking.
