(ns com.amazonaws.services.codedeploy.AbstractAmazonCodeDeploy
  "Abstract implementation of AmazonCodeDeploy. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.codedeploy AbstractAmazonCodeDeploy]))

(defn get-on-premises-instance
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a GetOnPremisesInstance operation. - `com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest`

  returns: Result of the GetOnPremisesInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult`"
  (^com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetOnPremisesInstanceRequest request]
    (-> this (.getOnPremisesInstance request))))

(defn put-lifecycle-event-hook-execution-status
  "Description copied from interface: AmazonCodeDeploy

  request - `com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest`

  returns: Result of the PutLifecycleEventHookExecutionStatus operation returned by the service. - `com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult`"
  (^com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.PutLifecycleEventHookExecutionStatusRequest request]
    (-> this (.putLifecycleEventHookExecutionStatus request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonCodeDeploy

  request - `com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.codedeploy.model.ListTagsForResourceResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-deployment-configs
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a ListDeploymentConfigs operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest`

  returns: Result of the ListDeploymentConfigs operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult`"
  (^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsRequest request]
    (-> this (.listDeploymentConfigs request)))
  (^com.amazonaws.services.codedeploy.model.ListDeploymentConfigsResult [^AbstractAmazonCodeDeploy this]
    (-> this (.listDeploymentConfigs))))

(defn set-region
  "Description copied from interface: AmazonCodeDeploy

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonCodeDeploy this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-deployment-instances
  "Deprecated.

  request - Represents the input of a ListDeploymentInstances operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest`

  returns: Result of the ListDeploymentInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult`"
  (^com.amazonaws.services.codedeploy.model.ListDeploymentInstancesResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListDeploymentInstancesRequest request]
    (-> this (.listDeploymentInstances request))))

(defn waiters
  "returns: `com.amazonaws.services.codedeploy.waiters.AmazonCodeDeployWaiters`"
  (^com.amazonaws.services.codedeploy.waiters.AmazonCodeDeployWaiters [^AbstractAmazonCodeDeploy this]
    (-> this (.waiters))))

(defn register-on-premises-instance
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of the register on-premises instance operation. - `com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest`

  returns: Result of the RegisterOnPremisesInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult`"
  (^com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.RegisterOnPremisesInstanceRequest request]
    (-> this (.registerOnPremisesInstance request))))

(defn add-tags-to-on-premises-instances
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of, and adds tags to, an on-premises instance operation. - `com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest`

  returns: Result of the AddTagsToOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult`"
  (^com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.AddTagsToOnPremisesInstancesRequest request]
    (-> this (.addTagsToOnPremisesInstances request))))

(defn list-application-revisions
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a ListApplicationRevisions operation. - `com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest`

  returns: Result of the ListApplicationRevisions operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult`"
  (^com.amazonaws.services.codedeploy.model.ListApplicationRevisionsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListApplicationRevisionsRequest request]
    (-> this (.listApplicationRevisions request))))

(defn untag-resource
  "Description copied from interface: AmazonCodeDeploy

  request - `com.amazonaws.services.codedeploy.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.codedeploy.model.UntagResourceResult`"
  (^com.amazonaws.services.codedeploy.model.UntagResourceResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn get-deployment-config
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a GetDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest`

  returns: Result of the GetDeploymentConfig operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult`"
  (^com.amazonaws.services.codedeploy.model.GetDeploymentConfigResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetDeploymentConfigRequest request]
    (-> this (.getDeploymentConfig request))))

(defn stop-deployment
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a StopDeployment operation. - `com.amazonaws.services.codedeploy.model.StopDeploymentRequest`

  returns: Result of the StopDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.StopDeploymentResult`"
  (^com.amazonaws.services.codedeploy.model.StopDeploymentResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.StopDeploymentRequest request]
    (-> this (.stopDeployment request))))

(defn create-deployment-group
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a CreateDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest`

  returns: Result of the CreateDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult`"
  (^com.amazonaws.services.codedeploy.model.CreateDeploymentGroupResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.CreateDeploymentGroupRequest request]
    (-> this (.createDeploymentGroup request))))

(defn batch-get-deployments
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a BatchGetDeployments operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest`

  returns: Result of the BatchGetDeployments operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult`"
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsRequest request]
    (-> this (.batchGetDeployments request)))
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentsResult [^AbstractAmazonCodeDeploy this]
    (-> this (.batchGetDeployments))))

(defn delete-application
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a DeleteApplication operation. - `com.amazonaws.services.codedeploy.model.DeleteApplicationRequest`

  returns: Result of the DeleteApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteApplicationResult`"
  (^com.amazonaws.services.codedeploy.model.DeleteApplicationResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.DeleteApplicationRequest request]
    (-> this (.deleteApplication request))))

(defn get-deployment
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a GetDeployment operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentRequest`

  returns: Result of the GetDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentResult`"
  (^com.amazonaws.services.codedeploy.model.GetDeploymentResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetDeploymentRequest request]
    (-> this (.getDeployment request))))

(defn list-applications
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a ListApplications operation. - `com.amazonaws.services.codedeploy.model.ListApplicationsRequest`

  returns: Result of the ListApplications operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListApplicationsResult`"
  (^com.amazonaws.services.codedeploy.model.ListApplicationsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListApplicationsRequest request]
    (-> this (.listApplications request)))
  (^com.amazonaws.services.codedeploy.model.ListApplicationsResult [^AbstractAmazonCodeDeploy this]
    (-> this (.listApplications))))

(defn get-application-revision
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a GetApplicationRevision operation. - `com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest`

  returns: Result of the GetApplicationRevision operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult`"
  (^com.amazonaws.services.codedeploy.model.GetApplicationRevisionResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetApplicationRevisionRequest request]
    (-> this (.getApplicationRevision request))))

(defn get-deployment-target
  "Description copied from interface: AmazonCodeDeploy

  request - `com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest`

  returns: Result of the GetDeploymentTarget operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentTargetResult`"
  (^com.amazonaws.services.codedeploy.model.GetDeploymentTargetResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetDeploymentTargetRequest request]
    (-> this (.getDeploymentTarget request))))

(defn list-on-premises-instances
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a ListOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest`

  returns: Result of the ListOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult`"
  (^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesRequest request]
    (-> this (.listOnPremisesInstances request)))
  (^com.amazonaws.services.codedeploy.model.ListOnPremisesInstancesResult [^AbstractAmazonCodeDeploy this]
    (-> this (.listOnPremisesInstances))))

(defn delete-deployment-group
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a DeleteDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest`

  returns: Result of the DeleteDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult`"
  (^com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentGroupRequest request]
    (-> this (.deleteDeploymentGroup request))))

(defn create-deployment
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a CreateDeployment operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentRequest`

  returns: Result of the CreateDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateDeploymentResult`"
  (^com.amazonaws.services.codedeploy.model.CreateDeploymentResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.CreateDeploymentRequest request]
    (-> this (.createDeployment request))))

(defn batch-get-deployment-groups
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a BatchGetDeploymentGroups operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest`

  returns: Result of the BatchGetDeploymentGroups operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult`"
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentGroupsRequest request]
    (-> this (.batchGetDeploymentGroups request))))

(defn shutdown
  "Description copied from interface: AmazonCodeDeploy"
  ([^AbstractAmazonCodeDeploy this]
    (-> this (.shutdown))))

(defn update-application
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of an UpdateApplication operation. - `com.amazonaws.services.codedeploy.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.UpdateApplicationResult`"
  (^com.amazonaws.services.codedeploy.model.UpdateApplicationResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.UpdateApplicationRequest request]
    (-> this (.updateApplication request)))
  (^com.amazonaws.services.codedeploy.model.UpdateApplicationResult [^AbstractAmazonCodeDeploy this]
    (-> this (.updateApplication))))

(defn delete-git-hub-account-token
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a DeleteGitHubAccount operation. - `com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest`

  returns: Result of the DeleteGitHubAccountToken operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult`"
  (^com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.DeleteGitHubAccountTokenRequest request]
    (-> this (.deleteGitHubAccountToken request))))

(defn set-endpoint
  "Description copied from interface: AmazonCodeDeploy

  endpoint - The endpoint (ex: \"codedeploy.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://codedeploy.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonCodeDeploy this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn register-application-revision
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a RegisterApplicationRevision operation. - `com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest`

  returns: Result of the RegisterApplicationRevision operation returned by the service. - `com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult`"
  (^com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.RegisterApplicationRevisionRequest request]
    (-> this (.registerApplicationRevision request))))

(defn create-application
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a CreateApplication operation. - `com.amazonaws.services.codedeploy.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateApplicationResult`"
  (^com.amazonaws.services.codedeploy.model.CreateApplicationResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn list-deployments
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a ListDeployments operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentsRequest`

  returns: Result of the ListDeployments operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentsResult`"
  (^com.amazonaws.services.codedeploy.model.ListDeploymentsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListDeploymentsRequest request]
    (-> this (.listDeployments request)))
  (^com.amazonaws.services.codedeploy.model.ListDeploymentsResult [^AbstractAmazonCodeDeploy this]
    (-> this (.listDeployments))))

(defn get-deployment-instance
  "Deprecated.

  request - Represents the input of a GetDeploymentInstance operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest`

  returns: Result of the GetDeploymentInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult`"
  (^com.amazonaws.services.codedeploy.model.GetDeploymentInstanceResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetDeploymentInstanceRequest request]
    (-> this (.getDeploymentInstance request))))

(defn continue-deployment
  "Description copied from interface: AmazonCodeDeploy

  request - `com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest`

  returns: Result of the ContinueDeployment operation returned by the service. - `com.amazonaws.services.codedeploy.model.ContinueDeploymentResult`"
  (^com.amazonaws.services.codedeploy.model.ContinueDeploymentResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ContinueDeploymentRequest request]
    (-> this (.continueDeployment request))))

(defn get-application
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a GetApplication operation. - `com.amazonaws.services.codedeploy.model.GetApplicationRequest`

  returns: Result of the GetApplication operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetApplicationResult`"
  (^com.amazonaws.services.codedeploy.model.GetApplicationResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetApplicationRequest request]
    (-> this (.getApplication request))))

(defn remove-tags-from-on-premises-instances
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a RemoveTagsFromOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest`

  returns: Result of the RemoveTagsFromOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult`"
  (^com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.RemoveTagsFromOnPremisesInstancesRequest request]
    (-> this (.removeTagsFromOnPremisesInstances request))))

(defn create-deployment-config
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a CreateDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest`

  returns: Result of the CreateDeploymentConfig operation returned by the service. - `com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult`"
  (^com.amazonaws.services.codedeploy.model.CreateDeploymentConfigResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.CreateDeploymentConfigRequest request]
    (-> this (.createDeploymentConfig request))))

(defn skip-wait-time-for-instance-termination
  "Deprecated.

  request - `com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest`

  returns: Result of the SkipWaitTimeForInstanceTermination operation returned by the service. - `com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult`"
  (^com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.SkipWaitTimeForInstanceTerminationRequest request]
    (-> this (.skipWaitTimeForInstanceTermination request))))

(defn batch-get-deployment-targets
  "Description copied from interface: AmazonCodeDeploy

  request - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest`

  returns: Result of the BatchGetDeploymentTargets operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsResult`"
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentTargetsRequest request]
    (-> this (.batchGetDeploymentTargets request))))

(defn batch-get-applications
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a BatchGetApplications operation. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest`

  returns: Result of the BatchGetApplications operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult`"
  (^com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationsRequest request]
    (-> this (.batchGetApplications request)))
  (^com.amazonaws.services.codedeploy.model.BatchGetApplicationsResult [^AbstractAmazonCodeDeploy this]
    (-> this (.batchGetApplications))))

(defn list-deployment-groups
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a ListDeploymentGroups operation. - `com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest`

  returns: Result of the ListDeploymentGroups operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult`"
  (^com.amazonaws.services.codedeploy.model.ListDeploymentGroupsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListDeploymentGroupsRequest request]
    (-> this (.listDeploymentGroups request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonCodeDeploy

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonCodeDeploy this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn batch-get-on-premises-instances
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a BatchGetOnPremisesInstances operation. - `com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest`

  returns: Result of the BatchGetOnPremisesInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult`"
  (^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesRequest request]
    (-> this (.batchGetOnPremisesInstances request)))
  (^com.amazonaws.services.codedeploy.model.BatchGetOnPremisesInstancesResult [^AbstractAmazonCodeDeploy this]
    (-> this (.batchGetOnPremisesInstances))))

(defn update-deployment-group
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of an UpdateDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest`

  returns: Result of the UpdateDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult`"
  (^com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.UpdateDeploymentGroupRequest request]
    (-> this (.updateDeploymentGroup request))))

(defn list-deployment-targets
  "Description copied from interface: AmazonCodeDeploy

  request - `com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest`

  returns: Result of the ListDeploymentTargets operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListDeploymentTargetsResult`"
  (^com.amazonaws.services.codedeploy.model.ListDeploymentTargetsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListDeploymentTargetsRequest request]
    (-> this (.listDeploymentTargets request))))

(defn batch-get-application-revisions
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a BatchGetApplicationRevisions operation. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest`

  returns: Result of the BatchGetApplicationRevisions operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult`"
  (^com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetApplicationRevisionsRequest request]
    (-> this (.batchGetApplicationRevisions request))))

(defn deregister-on-premises-instance
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a DeregisterOnPremisesInstance operation. - `com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest`

  returns: Result of the DeregisterOnPremisesInstance operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult`"
  (^com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.DeregisterOnPremisesInstanceRequest request]
    (-> this (.deregisterOnPremisesInstance request))))

(defn tag-resource
  "Description copied from interface: AmazonCodeDeploy

  request - `com.amazonaws.services.codedeploy.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.codedeploy.model.TagResourceResult`"
  (^com.amazonaws.services.codedeploy.model.TagResourceResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn batch-get-deployment-instances
  "Deprecated.

  request - Represents the input of a BatchGetDeploymentInstances operation. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest`

  returns: Result of the BatchGetDeploymentInstances operation returned by the service. - `com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult`"
  (^com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.BatchGetDeploymentInstancesRequest request]
    (-> this (.batchGetDeploymentInstances request))))

(defn get-deployment-group
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a GetDeploymentGroup operation. - `com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest`

  returns: Result of the GetDeploymentGroup operation returned by the service. - `com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult`"
  (^com.amazonaws.services.codedeploy.model.GetDeploymentGroupResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.GetDeploymentGroupRequest request]
    (-> this (.getDeploymentGroup request))))

(defn list-git-hub-account-token-names
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a ListGitHubAccountTokenNames operation. - `com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest`

  returns: Result of the ListGitHubAccountTokenNames operation returned by the service. - `com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult`"
  (^com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.ListGitHubAccountTokenNamesRequest request]
    (-> this (.listGitHubAccountTokenNames request))))

(defn delete-deployment-config
  "Description copied from interface: AmazonCodeDeploy

  request - Represents the input of a DeleteDeploymentConfig operation. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest`

  returns: Result of the DeleteDeploymentConfig operation returned by the service. - `com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult`"
  (^com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigResult [^AbstractAmazonCodeDeploy this ^com.amazonaws.services.codedeploy.model.DeleteDeploymentConfigRequest request]
    (-> this (.deleteDeploymentConfig request))))

