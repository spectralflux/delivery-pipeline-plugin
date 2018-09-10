package se.diabol.jenkins.pipeline.sort;

import hudson.Extension;
import se.diabol.jenkins.core.GenericComponent;

import java.io.Serializable;

public class NameDescendingComparator extends GenericComponentComparator implements Serializable {

    @Override
    public int compare(GenericComponent component1, GenericComponent component2) {
        return - (component1.getName().compareTo(component2.getName()));
    }

    @Extension
    public static class DescriptorImpl extends ComponentComparatorDescriptor {
        @Override
        public String getDisplayName() {
            return "Sort by title descending";
        }

        @Override
        public GenericComponentComparator createInstance() {
            return new NameDescendingComparator();
        }
    }
}
