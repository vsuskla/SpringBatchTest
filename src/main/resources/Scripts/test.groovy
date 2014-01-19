import org.springframework.batch.core.launch.support.CommandLineJobRunner
System.properties['spring.profiles.active'] = 'standalone'
//System.properties['logdirectory'] = 'D:/logs'
System.properties['logdirectory'] = '/Users/klaus/dev/batchFiles/logs'
System.properties['environment'] = 'TEST'

// Fyller opp T2545 med data
// mode=file: write to files for loading into DB2
// mode=insert: write to DB
// mode=diff: write modified rows to DB
// optional parameter: taxYear (default current year - 1)
// optional parameter: oppgavetype (default RFREA3)
// optional parameters: kuIdent, vnrIso, kontohaverId, schema

//def params = 'mode=insert taxYear=2013 kuIdent=23100 run.id=20140104_1'
def params = 'mode=insert taxYear=2013 run.id=20140118_3'

CommandLineJobRunner.main("/launch-context.xml JARRFR01 $params".split())
