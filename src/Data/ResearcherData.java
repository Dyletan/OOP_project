package OOP.Data;

import java.util.Objects;

public class ResearcherData {
    private Vector<ResearcherPaper> researcherPapers;
    private Vector<ResearcherProject> researcherProjects;

    public ResearcherData() {
    }

    public ResearcherData(Vector<ResearcherPaper> researcherPapers, Vector<ResearcherProject> researcherProjects) {
        this.researcherPapers = researcherPapers;
        this.researcherProjects = researcherProjects;
    }

    public Vector<ResearcherPaper> getResearcherPapers() {
        return researcherPapers;
    }

    public void setResearcherPapers(Vector<ResearcherPaper> researcherPapers) {
        this.researcherPapers = researcherPapers;
    }

    public Vector<ResearcherProject> getResearcherProjects() {
        return researcherProjects;
    }

    public void setResearcherProjects(Vector<ResearcherProject> researcherProjects) {
        this.researcherProjects = researcherProjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResearcherData that = (ResearcherData) o;
        return Objects.equals(researcherPapers, that.researcherPapers) && Objects.equals(researcherProjects, that.researcherProjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(researcherPapers, researcherProjects);
    }

    @Override
    public String toString() {
        return "ResearcherData{" +
                "researcherPapers=" + researcherPapers +
                ", researcherProjects=" + researcherProjects +
                '}';
    }
}
