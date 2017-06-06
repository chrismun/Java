class Event {

  private int hour;
  private int minute;
  private String name;
  private String strMinute;
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
    strMinute = Integer.toString(minute);
    if(minute < 10) {
      strMinute = "0" + strMinute;
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
      return strMinute;
    }

    public String getName() {
      return name;
    }

    public String getAmPm() {
      return ampm;
    }

  }
  
