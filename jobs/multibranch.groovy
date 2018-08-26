multibranchPipelineJob('python-deploy') {
    triggers {
        periodic(1)
    }

    branchSources {
        git {
            remote('git@github.com:hacosta333/jenkinstest.git')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
