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
        Job testJob3 = new Job(new Job(), "Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob3 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
    Job testJob4 = new Job(new Job(), "Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob5 = new Job(new Job(), "Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(testJob4.equals(testJob5));
    }

}