package Entities;

import java.util.Collections;
import java.util.Comparator;

public interface Researcher {
    default void printPapers(Comparator c){
        Vector<ResearchPaper> temp = getResearchPapers();
        Collections.sort(temp, c);
        for(ReseachPaper p : temp){
            System.out.println(p); // need to implement toString() of paper
        }
    }
    int calculateHIndex(){

    };
    default void addResearchPaper(ResearchPaper paper){
        getResesearchPapers().add(paper);
    }
    default void addResearchProject(ResearchProject project){
        getResesearchProjects().add(project);
    }

    default Vector<ResearchPaper> getResearchPapers(){
        return DataBase.getInstance().getDataOfResearchers().get(this).getResesearchPapers();
    }

    default Vector<ResearchProject> getResearchProjects(){
        return DataBase.getInstance().getDataOfResearchers().get(this).getResesearchProjects();
    }
}
