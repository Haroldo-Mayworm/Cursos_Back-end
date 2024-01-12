public class School {

  private String name;
  private Teacher[] teachers;

  public School(String name) {
    this.name = name;
  }

  public School(String name, Teacher[] teachers) {
    this(name);
    this.teachers = teachers;
  }

  public void print() {
    System.out.println(this.name);
    if (teachers == null) return;
    for (Teacher teacher : teachers) {
      System.out.println(teacher.getName());
    }
  }

  // Getters
  public String getName() {
    return name;
  }

  public Teacher[] getTeachers() {
    return teachers;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setTeachers(Teacher[] teachers) {
    this.teachers = teachers;
  }
}
