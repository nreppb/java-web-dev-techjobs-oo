package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob1;
    Job testJob2;

    @Before
    public void createJobObjectsWithEmptyConstructor() {
        testJob1 = new Job();
        testJob2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(testJob1.getId(), testJob2.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob3 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob4.equals(testJob5));
    }

    @Test
    public void testToStringReturnsBlankLineBeforeAndAfterJobClass() {
        Job testJob6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob6.toString().startsWith("\n") && testJob6.toString().endsWith("\n"));
    }

    @Test
    public void testToStringContainsLabelForEachFieldFromJobClass() {
        Job testJob7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(("\n" +
                "ID: " + testJob7.getId() +
                "\nName: " + testJob7.getName() +
                "\nEmployer: " + testJob7.getEmployer() +
                "\nLocation: " + testJob7.getLocation() +
                "\nPosition Type: " + testJob7.getPositionType() +
                "\nCore Competency: " + testJob7.getCoreCompetency() +
                "\n"), testJob7.toString());
    }

    @Test
    public void testIfFieldIsEmptyShouldStateDataNotAvailable() {
        Job testJob8 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        assertEquals(testJob8.getEmployer().toString(), "Data not available");
    }
}