package com.ldbc.driver.workloads.ldbc.snb.bi;

import com.google.common.collect.Lists;
import com.ldbc.driver.Operation;
import com.ldbc.driver.control.ConsoleAndFileDriverConfiguration;
import com.ldbc.driver.control.DriverConfigurationException;
import com.ldbc.driver.control.DriverConfigurationFileHelper;
import com.ldbc.driver.util.MapUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.ldbc.driver.util.FileUtils.removeSuffix;

public class LdbcSnbBiWorkloadConfiguration
{
    public final static String LDBC_SNB_BI_PARAM_NAME_PREFIX = "ldbc.snb.bi.";
    // directory that contains the substitution parameters files
    public final static String PARAMETERS_DIRECTORY = LDBC_SNB_BI_PARAM_NAME_PREFIX + "parameters_dir";
    public final static String LDBC_SNB_BI_PACKAGE_PREFIX = removeSuffix(
            LdbcSnbBiWorkloadConfiguration.class.getName(), LdbcSnbBiWorkloadConfiguration.class.getSimpleName()
    );

    /*
     * Operation frequency
     */
    public final static String FREQUENCY_SUFFIX = "_freq";
    public final static String OPERATION_1_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery1.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_2_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery2.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_3_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery3.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_4_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery4.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_5_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery5.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_6_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery6.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_7_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery7.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_8_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery8.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_9_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery9.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_10_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery10.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_11_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery11.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_12_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery12.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_13_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery13.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_14_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery14.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_15_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery15.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_16_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery16.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_17_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery17.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_18_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery18.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_19_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery19.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_20_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery20.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_21_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery21.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_22_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery22.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_23_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery23.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static String OPERATION_24_FREQUENCY_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery24.class.getSimpleName() + FREQUENCY_SUFFIX;
    public final static List<String> OPERATION_FREQUENCY_KEYS = Lists.newArrayList(
            OPERATION_1_FREQUENCY_KEY,
            OPERATION_2_FREQUENCY_KEY,
            OPERATION_3_FREQUENCY_KEY,
            OPERATION_4_FREQUENCY_KEY,
            OPERATION_5_FREQUENCY_KEY,
            OPERATION_6_FREQUENCY_KEY,
            OPERATION_7_FREQUENCY_KEY,
            OPERATION_8_FREQUENCY_KEY,
            OPERATION_9_FREQUENCY_KEY,
            OPERATION_10_FREQUENCY_KEY,
            OPERATION_11_FREQUENCY_KEY,
            OPERATION_12_FREQUENCY_KEY,
            OPERATION_13_FREQUENCY_KEY,
            OPERATION_14_FREQUENCY_KEY,
            OPERATION_15_FREQUENCY_KEY,
            OPERATION_16_FREQUENCY_KEY,
            OPERATION_17_FREQUENCY_KEY,
            OPERATION_18_FREQUENCY_KEY,
            OPERATION_19_FREQUENCY_KEY,
            OPERATION_20_FREQUENCY_KEY,
            OPERATION_21_FREQUENCY_KEY,
            OPERATION_22_FREQUENCY_KEY,
            OPERATION_23_FREQUENCY_KEY,
            OPERATION_24_FREQUENCY_KEY
    );

    /*
    * Operation Interleave
    */
    public final static String INTERLEAVE_SUFFIX = "_interleave";
    public final static String OPERATION_1_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery1.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_2_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery2.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_3_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery3.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_4_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery4.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_5_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery5.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_6_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery6.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_7_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery7.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_8_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery8.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_9_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery9.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_10_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery10.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_11_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery11.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_12_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery12.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_13_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery13.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_14_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery14.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_15_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery15.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_16_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery16.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_17_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery17.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_18_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery18.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_19_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery19.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_20_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery20.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_21_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery21.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_22_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery22.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_23_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery23.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static String OPERATION_24_INTERLEAVE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery24.class.getSimpleName() + INTERLEAVE_SUFFIX;
    public final static List<String> OPERATION_INTERLEAVE_KEYS = Lists.newArrayList(
            OPERATION_1_INTERLEAVE_KEY,
            OPERATION_2_INTERLEAVE_KEY,
            OPERATION_3_INTERLEAVE_KEY,
            OPERATION_4_INTERLEAVE_KEY,
            OPERATION_5_INTERLEAVE_KEY,
            OPERATION_6_INTERLEAVE_KEY,
            OPERATION_7_INTERLEAVE_KEY,
            OPERATION_8_INTERLEAVE_KEY,
            OPERATION_9_INTERLEAVE_KEY,
            OPERATION_10_INTERLEAVE_KEY,
            OPERATION_11_INTERLEAVE_KEY,
            OPERATION_12_INTERLEAVE_KEY,
            OPERATION_13_INTERLEAVE_KEY,
            OPERATION_14_INTERLEAVE_KEY,
            OPERATION_15_INTERLEAVE_KEY,
            OPERATION_16_INTERLEAVE_KEY,
            OPERATION_17_INTERLEAVE_KEY,
            OPERATION_18_INTERLEAVE_KEY,
            OPERATION_19_INTERLEAVE_KEY,
            OPERATION_20_INTERLEAVE_KEY,
            OPERATION_21_INTERLEAVE_KEY,
            OPERATION_22_INTERLEAVE_KEY,
            OPERATION_23_INTERLEAVE_KEY,
            OPERATION_24_INTERLEAVE_KEY
    );

    /*
     * Operation Enable
     */
    public final static String ENABLE_SUFFIX = "_enable";
    public final static String OPERATION_1_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery1.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_2_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery2.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_3_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery3.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_4_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery4.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_5_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery5.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_6_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery6.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_7_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery7.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_8_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery8.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_9_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery9.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_10_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery10.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_11_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery11.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_12_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery12.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_13_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery13.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_14_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery14.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_15_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery15.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_16_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery16.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_17_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery17.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_18_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery18.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_19_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery19.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_20_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery20.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_21_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery21.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_22_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery22.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_23_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery23.class.getSimpleName() + ENABLE_SUFFIX;
    public final static String OPERATION_24_ENABLE_KEY =
            LDBC_SNB_BI_PARAM_NAME_PREFIX + LdbcSnbBiQuery24.class.getSimpleName() + ENABLE_SUFFIX;
    public final static List<String> OPERATION_ENABLE_KEYS = Lists.newArrayList(
            OPERATION_1_ENABLE_KEY,
            OPERATION_2_ENABLE_KEY,
            OPERATION_3_ENABLE_KEY,
            OPERATION_4_ENABLE_KEY,
            OPERATION_5_ENABLE_KEY,
            OPERATION_6_ENABLE_KEY,
            OPERATION_7_ENABLE_KEY,
            OPERATION_8_ENABLE_KEY,
            OPERATION_9_ENABLE_KEY,
            OPERATION_10_ENABLE_KEY,
            OPERATION_11_ENABLE_KEY,
            OPERATION_12_ENABLE_KEY,
            OPERATION_13_ENABLE_KEY,
            OPERATION_14_ENABLE_KEY,
            OPERATION_15_ENABLE_KEY,
            OPERATION_16_ENABLE_KEY,
            OPERATION_17_ENABLE_KEY,
            OPERATION_18_ENABLE_KEY,
            OPERATION_19_ENABLE_KEY,
            OPERATION_20_ENABLE_KEY,
            OPERATION_21_ENABLE_KEY,
            OPERATION_22_ENABLE_KEY,
            OPERATION_23_ENABLE_KEY,
            OPERATION_24_ENABLE_KEY
    );

    /*
     * Read Operation Parameters
     */
    public final static String OPERATION_1_PARAMS_FILENAME = "query_1_param.txt";
    public final static String OPERATION_2_PARAMS_FILENAME = "query_2_param.txt";
    public final static String OPERATION_3_PARAMS_FILENAME = "query_3_param.txt";
    public final static String OPERATION_4_PARAMS_FILENAME = "query_4_param.txt";
    public final static String OPERATION_5_PARAMS_FILENAME = "query_5_param.txt";
    public final static String OPERATION_6_PARAMS_FILENAME = "query_6_param.txt";
    public final static String OPERATION_7_PARAMS_FILENAME = "query_7_param.txt";
    public final static String OPERATION_8_PARAMS_FILENAME = "query_8_param.txt";
    public final static String OPERATION_9_PARAMS_FILENAME = "query_9_param.txt";
    public final static String OPERATION_10_PARAMS_FILENAME = "query_10_param.txt";
    public final static String OPERATION_11_PARAMS_FILENAME = "query_11_param.txt";
    public final static String OPERATION_12_PARAMS_FILENAME = "query_12_param.txt";
    public final static String OPERATION_13_PARAMS_FILENAME = "query_13_param.txt";
    public final static String OPERATION_14_PARAMS_FILENAME = "query_14_param.txt";
    public final static String OPERATION_15_PARAMS_FILENAME = "query_15_param.txt";
    public final static String OPERATION_16_PARAMS_FILENAME = "query_16_param.txt";
    public final static String OPERATION_17_PARAMS_FILENAME = "query_17_param.txt";
    public final static String OPERATION_18_PARAMS_FILENAME = "query_18_param.txt";
    public final static String OPERATION_19_PARAMS_FILENAME = "query_19_param.txt";
    public final static String OPERATION_20_PARAMS_FILENAME = "query_20_param.txt";
    public final static String OPERATION_21_PARAMS_FILENAME = "query_21_param.txt";
    public final static String OPERATION_22_PARAMS_FILENAME = "query_22_param.txt";
    public final static String OPERATION_23_PARAMS_FILENAME = "query_23_param.txt";
    public final static String OPERATION_24_PARAMS_FILENAME = "query_24_param.txt";
    public final static List<String> OPERATION_PARAMS_FILENAMES = Lists.newArrayList(
            OPERATION_1_PARAMS_FILENAME,
            OPERATION_2_PARAMS_FILENAME,
            OPERATION_3_PARAMS_FILENAME,
            OPERATION_4_PARAMS_FILENAME,
            OPERATION_5_PARAMS_FILENAME,
            OPERATION_6_PARAMS_FILENAME,
            OPERATION_7_PARAMS_FILENAME,
            OPERATION_8_PARAMS_FILENAME,
            OPERATION_9_PARAMS_FILENAME,
            OPERATION_10_PARAMS_FILENAME,
            OPERATION_11_PARAMS_FILENAME,
            OPERATION_12_PARAMS_FILENAME,
            OPERATION_13_PARAMS_FILENAME,
            OPERATION_14_PARAMS_FILENAME,
            OPERATION_15_PARAMS_FILENAME,
            OPERATION_16_PARAMS_FILENAME,
            OPERATION_17_PARAMS_FILENAME,
            OPERATION_18_PARAMS_FILENAME,
            OPERATION_19_PARAMS_FILENAME,
            OPERATION_20_PARAMS_FILENAME,
            OPERATION_21_PARAMS_FILENAME,
            OPERATION_22_PARAMS_FILENAME,
            OPERATION_23_PARAMS_FILENAME,
            OPERATION_24_PARAMS_FILENAME
    );

    public static Map<String,String> applyInterleaves( Map<String,String> params, LdbcSnbBiInterleaves interleaves )
    {
        Map<String,String> newParams = new HashMap<>();
        for ( String paramKey : params.keySet() )
        {
            newParams.put( paramKey, params.get( paramKey ) );
        }
        newParams.put( OPERATION_1_INTERLEAVE_KEY, Long.toString( interleaves.operation1Interleave ) );
        newParams.put( OPERATION_2_INTERLEAVE_KEY, Long.toString( interleaves.operation2Interleave ) );
        newParams.put( OPERATION_3_INTERLEAVE_KEY, Long.toString( interleaves.operation3Interleave ) );
        newParams.put( OPERATION_4_INTERLEAVE_KEY, Long.toString( interleaves.operation4Interleave ) );
        newParams.put( OPERATION_5_INTERLEAVE_KEY, Long.toString( interleaves.operation5Interleave ) );
        newParams.put( OPERATION_6_INTERLEAVE_KEY, Long.toString( interleaves.operation6Interleave ) );
        newParams.put( OPERATION_7_INTERLEAVE_KEY, Long.toString( interleaves.operation7Interleave ) );
        newParams.put( OPERATION_8_INTERLEAVE_KEY, Long.toString( interleaves.operation8Interleave ) );
        newParams.put( OPERATION_9_INTERLEAVE_KEY, Long.toString( interleaves.operation9Interleave ) );
        newParams.put( OPERATION_10_INTERLEAVE_KEY, Long.toString( interleaves.operation10Interleave ) );
        newParams.put( OPERATION_11_INTERLEAVE_KEY, Long.toString( interleaves.operation11Interleave ) );
        newParams.put( OPERATION_12_INTERLEAVE_KEY, Long.toString( interleaves.operation12Interleave ) );
        newParams.put( OPERATION_13_INTERLEAVE_KEY, Long.toString( interleaves.operation13Interleave ) );
        newParams.put( OPERATION_14_INTERLEAVE_KEY, Long.toString( interleaves.operation14Interleave ) );
        newParams.put( OPERATION_15_INTERLEAVE_KEY, Long.toString( interleaves.operation15Interleave ) );
        newParams.put( OPERATION_16_INTERLEAVE_KEY, Long.toString( interleaves.operation16Interleave ) );
        newParams.put( OPERATION_17_INTERLEAVE_KEY, Long.toString( interleaves.operation17Interleave ) );
        newParams.put( OPERATION_18_INTERLEAVE_KEY, Long.toString( interleaves.operation18Interleave ) );
        newParams.put( OPERATION_19_INTERLEAVE_KEY, Long.toString( interleaves.operation19Interleave ) );
        newParams.put( OPERATION_20_INTERLEAVE_KEY, Long.toString( interleaves.operation20Interleave ) );
        newParams.put( OPERATION_21_INTERLEAVE_KEY, Long.toString( interleaves.operation21Interleave ) );
        newParams.put( OPERATION_22_INTERLEAVE_KEY, Long.toString( interleaves.operation22Interleave ) );
        newParams.put( OPERATION_23_INTERLEAVE_KEY, Long.toString( interleaves.operation23Interleave ) );
        newParams.put( OPERATION_24_INTERLEAVE_KEY, Long.toString( interleaves.operation24Interleave ) );
        return newParams;
    }

    public static LdbcSnbBiInterleaves interleavesFromFrequencyParams( Map<String,String> params )
    {
        // TODO revise/replace
        Integer minimumDistanceAsMilli = 1;
        return LdbcSnbBiInterleaves.fromFrequencies(
                minimumDistanceAsMilli,
                Long.parseLong( params.get( OPERATION_1_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_2_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_3_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_4_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_5_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_6_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_7_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_8_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_9_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_10_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_11_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_12_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_13_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_14_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_15_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_16_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_17_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_18_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_19_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_20_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_21_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_22_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_23_FREQUENCY_KEY ) ),
                Long.parseLong( params.get( OPERATION_24_FREQUENCY_KEY ) )
        );
    }

    public static LdbcSnbBiInterleaves interleavesFromInterleaveParams(
            Map<String,String> params )
    {
        return new LdbcSnbBiInterleaves(
                Long.parseLong( params.get( OPERATION_1_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_2_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_3_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_4_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_5_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_6_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_7_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_8_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_9_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_10_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_11_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_12_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_13_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_14_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_15_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_16_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_17_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_18_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_19_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_20_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_21_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_22_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_23_INTERLEAVE_KEY ) ),
                Long.parseLong( params.get( OPERATION_24_INTERLEAVE_KEY ) )
        );
    }

    static class LdbcSnbBiInterleaves
    {
        final long operation1Interleave;
        final long operation2Interleave;
        final long operation3Interleave;
        final long operation4Interleave;
        final long operation5Interleave;
        final long operation6Interleave;
        final long operation7Interleave;
        final long operation8Interleave;
        final long operation9Interleave;
        final long operation10Interleave;
        final long operation11Interleave;
        final long operation12Interleave;
        final long operation13Interleave;
        final long operation14Interleave;
        final long operation15Interleave;
        final long operation16Interleave;
        final long operation17Interleave;
        final long operation18Interleave;
        final long operation19Interleave;
        final long operation20Interleave;
        final long operation21Interleave;
        final long operation22Interleave;
        final long operation23Interleave;
        final long operation24Interleave;

        static LdbcSnbBiInterleaves fromFrequencies(
                long minimumDistanceAsMilli,
                long operation1Frequency,
                long operation2Frequency,
                long operation3Frequency,
                long operation4Frequency,
                long operation5Frequency,
                long operation6Frequency,
                long operation7Frequency,
                long operation8Frequency,
                long operation9Frequency,
                long operation10Frequency,
                long operation11Frequency,
                long operation12Frequency,
                long operation13Frequency,
                long operation14Frequency,
                long operation15Frequency,
                long operation16Frequency,
                long operation17Frequency,
                long operation18Frequency,
                long operation19Frequency,
                long operation20Frequency,
                long operation21Frequency,
                long operation22Frequency,
                long operation23Frequency,
                long operation24Frequency )
        {
            return new LdbcSnbBiInterleaves(
                    operation1Frequency * minimumDistanceAsMilli,
                    operation2Frequency * minimumDistanceAsMilli,
                    operation3Frequency * minimumDistanceAsMilli,
                    operation4Frequency * minimumDistanceAsMilli,
                    operation5Frequency * minimumDistanceAsMilli,
                    operation6Frequency * minimumDistanceAsMilli,
                    operation7Frequency * minimumDistanceAsMilli,
                    operation8Frequency * minimumDistanceAsMilli,
                    operation9Frequency * minimumDistanceAsMilli,
                    operation10Frequency * minimumDistanceAsMilli,
                    operation11Frequency * minimumDistanceAsMilli,
                    operation12Frequency * minimumDistanceAsMilli,
                    operation13Frequency * minimumDistanceAsMilli,
                    operation14Frequency * minimumDistanceAsMilli,
                    operation15Frequency * minimumDistanceAsMilli,
                    operation16Frequency * minimumDistanceAsMilli,
                    operation17Frequency * minimumDistanceAsMilli,
                    operation18Frequency * minimumDistanceAsMilli,
                    operation19Frequency * minimumDistanceAsMilli,
                    operation20Frequency * minimumDistanceAsMilli,
                    operation21Frequency * minimumDistanceAsMilli,
                    operation22Frequency * minimumDistanceAsMilli,
                    operation23Frequency * minimumDistanceAsMilli,
                    operation24Frequency * minimumDistanceAsMilli
            );
        }

        private LdbcSnbBiInterleaves(
                long operation1Interleave,
                long operation2Interleave,
                long operation3Interleave,
                long operation4Interleave,
                long operation5Interleave,
                long operation6Interleave,
                long operation7Interleave,
                long operation8Interleave,
                long operation9Interleave,
                long operation10Interleave,
                long operation11Interleave,
                long operation12Interleave,
                long operation13Interleave,
                long operation14Interleave,
                long operation15Interleave,
                long operation16Interleave,
                long operation17Interleave,
                long operation18Interleave,
                long operation19Interleave,
                long operation20Interleave,
                long operation21Interleave,
                long operation22Interleave,
                long operation23Interleave,
                long operation24Interleave )
        {
            this.operation1Interleave = operation1Interleave;
            this.operation2Interleave = operation2Interleave;
            this.operation3Interleave = operation3Interleave;
            this.operation4Interleave = operation4Interleave;
            this.operation5Interleave = operation5Interleave;
            this.operation6Interleave = operation6Interleave;
            this.operation7Interleave = operation7Interleave;
            this.operation8Interleave = operation8Interleave;
            this.operation9Interleave = operation9Interleave;
            this.operation10Interleave = operation10Interleave;
            this.operation11Interleave = operation11Interleave;
            this.operation12Interleave = operation12Interleave;
            this.operation13Interleave = operation13Interleave;
            this.operation14Interleave = operation14Interleave;
            this.operation15Interleave = operation15Interleave;
            this.operation16Interleave = operation16Interleave;
            this.operation17Interleave = operation17Interleave;
            this.operation18Interleave = operation18Interleave;
            this.operation19Interleave = operation19Interleave;
            this.operation20Interleave = operation20Interleave;
            this.operation21Interleave = operation21Interleave;
            this.operation22Interleave = operation22Interleave;
            this.operation23Interleave = operation23Interleave;
            this.operation24Interleave = operation24Interleave;
        }
    }

    public static File defaultConfigFileSF1() throws DriverConfigurationException
    {
        return defaultConfigFileSF1FromWorkloadsDirectory(
                DriverConfigurationFileHelper.getWorkloadsDirectory()
        );
    }

    public static File defaultConfigFileSF1( File driverRootDirectory ) throws DriverConfigurationException
    {
        return defaultConfigFileSF1FromWorkloadsDirectory(
                DriverConfigurationFileHelper.getWorkloadsDirectory( driverRootDirectory )
        );
    }

    private static File defaultConfigFileSF1FromWorkloadsDirectory( File workloadsDirectory )
            throws DriverConfigurationException
    {
        return new File( workloadsDirectory, "ldbc/snb/bi/ldbc_snb_bi_SF-0001.properties" );
    }

    public static Map<String,String> defaultConfigSF1() throws DriverConfigurationException, IOException
    {
        return ConsoleAndFileDriverConfiguration.convertLongKeysToShortKeys(
                MapUtils.loadPropertiesToMap(
                        defaultConfigFileSF1()
                )
        );
    }

    public static Map<Integer,Class<? extends Operation>> operationTypeToClassMapping()
    {
        Map<Integer,Class<? extends Operation>> operationTypeToClassMapping = new HashMap<>();
        operationTypeToClassMapping.put( LdbcSnbBiQuery1.TYPE, LdbcSnbBiQuery1.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery2.TYPE, LdbcSnbBiQuery2.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery3.TYPE, LdbcSnbBiQuery3.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery4.TYPE, LdbcSnbBiQuery4.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery5.TYPE, LdbcSnbBiQuery5.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery6.TYPE, LdbcSnbBiQuery6.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery7.TYPE, LdbcSnbBiQuery7.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery8.TYPE, LdbcSnbBiQuery8.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery9.TYPE, LdbcSnbBiQuery9.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery10.TYPE, LdbcSnbBiQuery10.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery11.TYPE, LdbcSnbBiQuery11.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery12.TYPE, LdbcSnbBiQuery12.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery13.TYPE, LdbcSnbBiQuery13.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery14.TYPE, LdbcSnbBiQuery14.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery15.TYPE, LdbcSnbBiQuery15.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery16.TYPE, LdbcSnbBiQuery16.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery17.TYPE, LdbcSnbBiQuery17.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery18.TYPE, LdbcSnbBiQuery18.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery19.TYPE, LdbcSnbBiQuery19.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery20.TYPE, LdbcSnbBiQuery20.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery21.TYPE, LdbcSnbBiQuery21.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery22.TYPE, LdbcSnbBiQuery22.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery23.TYPE, LdbcSnbBiQuery23.class );
        operationTypeToClassMapping.put( LdbcSnbBiQuery24.TYPE, LdbcSnbBiQuery24.class );
        return operationTypeToClassMapping;
    }

    static Set<String> missingParameters( Map<String,String> parameters, Iterable<String> compulsoryParameterKeys )
    {
        Set<String> missingPropertyKeys = new HashSet<>();
        for ( String compulsoryKey : compulsoryParameterKeys )
        {
            if ( null == parameters.get( compulsoryKey ) )
            { missingPropertyKeys.add( compulsoryKey ); }
        }
        return missingPropertyKeys;
    }
}