package com.example.lombok.superbuilder;


class ChildClassWithSuperBuilderAnnotationTestFactory {

    /**
     * Custom builder class that Lombok will use as the basis for @SuperBuilder.
     * <p>
     * Lombok will:
     * - Extend this class
     * - Add builder methods for all fields (including inherited ones)
     * - Add the build() method
     * - Preserve any custom methods you define here
     */
    public static class TestBuilder extends ChildClassWithSuperBuilderAnnotation.ChildClassWithSuperBuilderAnnotationBuilder<ChildClassWithSuperBuilderAnnotation, TestBuilder> {

        public TestBuilder childAndParentField() {
            childField(100);
            parentField(100);
            return this;
        }

        @Override
        public ChildClassWithSuperBuilderAnnotation build() {
            return new ChildClassWithSuperBuilderAnnotation(this);
        }

        @Override
        protected TestBuilder self() {
            return this;
        }
    }

}