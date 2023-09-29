package cs207.linear;
import static java.lang.reflect.Array.newInstance;
import java.io.PrintWriter;

public class ReportingLinkedStructure<T> extends ReportingLinearStructure {
  /**
   * The underlying structure we're using for an experiment.
   */
  LinearStructure<T> ls;

  /**
   * The PrintWriter we use to generate output.
   */
  PrintWriter pen;

  /**
   * The prefix used for output.
   */
  String prefix;

  public ReportingLinkedStructure (LinearStructure<T> ls) {
    super(ls);

    this.pen = new PrintWriter(System.err, true);
    this.prefix = ls.getClass().getName() + ".";
  }


public static void main(String[] args) throws Exception{

  ReportingLinkedStructure temp = new ReportingLinkedStructure(LinearStructure<T> ls);
}

}