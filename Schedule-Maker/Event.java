class Event {

  private int hour;
  private int minute;
  private String name;
  private String sminute;
  private String ampm;


  //constructor
  public Event(int mhour, int mminute, String mampm, String mname) {

    ampm = mampm;
    name = mname;
    minute = mminute;
    hour = mhour;
    if(mampm.equals("pm")) {
      hour += 12;
    }
    sminute = Integer.toString(minute);
    if(minute < 10) {
      sminute = "0" + sminute;
    }
  }

  //getters
    public Integer getMilitaryHour() {
      return hour;
    }
    public Integer getHour() {
      return hour % 12;
    }

    public String getMinute() {
      return sminute;
    }

    public String getName() {
      return name;
    }

    public String getAmPm() {
      return ampm;
    }

  }
  
