import java.io.Serializable;
import java.util.Date;

public class BlogPost implements Comparable<BlogPost>, Serializable {
  private String mAuthor;
  private String mTitle;
  private String mBody;
  private String mCategory;
  private Date mCreationDate;

  public BlogPost(String author, String title, String body, String category, Date creationDate) {
    mAuthor = author;
    mTitle = title;
    mBody = body;
    mCategory = category;
    mCreationDate = creationDate;
  }

  public int compareTo(BlogPost other) {
    if (equals(other)) {
      return 0;
    }
    return mCreationDate.compareTo(other.mCreationDate);
  }

  public String[] getWords() {
    return mBody.split("\\s+");
  }

  public String getAuthor() {
    return mAuthor;
  }

  public String getTitle() {
    return mTitle;
  }

  public String getBody() {
    return mBody;
  }

  public String getCategory() {
    return mCategory;
  }

  public Date getCreationDate() {
    return mCreationDate;
  }
}
