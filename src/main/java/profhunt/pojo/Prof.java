package profhunt.pojo;

import java.util.List;

public class Prof {
  private String name;
  private String email;
  private String salutation;
  private String subject;
  private String emailTemplate;
  private List<FileToAttach> fileNames;

  @Override
  public String toString() {
    return "Prof{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", salutation='" + salutation + '\'' +
            ", subject='" + subject + '\'' +
            ", emailTemplate='" + emailTemplate + '\'' +
            ", fileNames=" + fileNames +
            '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getEmailTemplate() {
    return emailTemplate;
  }

  public void setEmailTemplate(String emailTemplate) {
    this.emailTemplate = emailTemplate;
  }

  public List<FileToAttach> getFileNames() {
    return fileNames;
  }

  public void setFileNames(List<FileToAttach> fileNames) {
    this.fileNames = fileNames;
  }
}
