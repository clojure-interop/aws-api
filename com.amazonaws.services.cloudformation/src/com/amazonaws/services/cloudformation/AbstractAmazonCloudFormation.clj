(ns com.amazonaws.services.cloudformation.AbstractAmazonCloudFormation
  "Abstract implementation of AmazonCloudFormation. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudformation AbstractAmazonCloudFormation]))

(defn detect-stack-drift
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.DetectStackDriftRequest`

  returns: Result of the DetectStackDrift operation returned by the service. - `com.amazonaws.services.cloudformation.model.DetectStackDriftResult`"
  (^com.amazonaws.services.cloudformation.model.DetectStackDriftResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DetectStackDriftRequest request]
    (-> this (.detectStackDrift request))))

(defn describe-stack-drift-detection-status
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest`

  returns: Result of the DescribeStackDriftDetectionStatus operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackDriftDetectionStatusRequest request]
    (-> this (.describeStackDriftDetectionStatus request))))

(defn detect-stack-resource-drift
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest`

  returns: Result of the DetectStackResourceDrift operation returned by the service. - `com.amazonaws.services.cloudformation.model.DetectStackResourceDriftResult`"
  (^com.amazonaws.services.cloudformation.model.DetectStackResourceDriftResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DetectStackResourceDriftRequest request]
    (-> this (.detectStackResourceDrift request))))

(defn update-stack-instances
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest`

  returns: Result of the UpdateStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult`"
  (^com.amazonaws.services.cloudformation.model.UpdateStackInstancesResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.UpdateStackInstancesRequest request]
    (-> this (.updateStackInstances request))))

(defn validate-template
  "Description copied from interface: AmazonCloudFormation

  request - The input for ValidateTemplate action. - `com.amazonaws.services.cloudformation.model.ValidateTemplateRequest`

  returns: Result of the ValidateTemplate operation returned by the service. - `com.amazonaws.services.cloudformation.model.ValidateTemplateResult`"
  (^com.amazonaws.services.cloudformation.model.ValidateTemplateResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ValidateTemplateRequest request]
    (-> this (.validateTemplate request))))

(defn describe-stacks
  "Description copied from interface: AmazonCloudFormation

  request - The input for DescribeStacks action. - `com.amazonaws.services.cloudformation.model.DescribeStacksRequest`

  returns: Result of the DescribeStacks operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStacksResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStacksResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStacksRequest request]
    (-> this (.describeStacks request)))
  (^com.amazonaws.services.cloudformation.model.DescribeStacksResult [^AbstractAmazonCloudFormation this]
    (-> this (.describeStacks))))

(defn set-region
  "Description copied from interface: AmazonCloudFormation

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonCloudFormation this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-stack-resource
  "Description copied from interface: AmazonCloudFormation

  request - The input for DescribeStackResource action. - `com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest`

  returns: Result of the DescribeStackResource operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackResourceResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackResourceResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceRequest request]
    (-> this (.describeStackResource request))))

(defn waiters
  "returns: `com.amazonaws.services.cloudformation.waiters.AmazonCloudFormationWaiters`"
  (^com.amazonaws.services.cloudformation.waiters.AmazonCloudFormationWaiters [^AbstractAmazonCloudFormation this]
    (-> this (.waiters))))

(defn get-stack-policy
  "Description copied from interface: AmazonCloudFormation

  request - The input for the GetStackPolicy action. - `com.amazonaws.services.cloudformation.model.GetStackPolicyRequest`

  returns: Result of the GetStackPolicy operation returned by the service. - `com.amazonaws.services.cloudformation.model.GetStackPolicyResult`"
  (^com.amazonaws.services.cloudformation.model.GetStackPolicyResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.GetStackPolicyRequest request]
    (-> this (.getStackPolicy request))))

(defn update-stack
  "Description copied from interface: AmazonCloudFormation

  request - The input for an UpdateStack action. - `com.amazonaws.services.cloudformation.model.UpdateStackRequest`

  returns: Result of the UpdateStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateStackResult`"
  (^com.amazonaws.services.cloudformation.model.UpdateStackResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.UpdateStackRequest request]
    (-> this (.updateStack request))))

(defn create-stack-set
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.CreateStackSetRequest`

  returns: Result of the CreateStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateStackSetResult`"
  (^com.amazonaws.services.cloudformation.model.CreateStackSetResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.CreateStackSetRequest request]
    (-> this (.createStackSet request))))

(defn execute-change-set
  "Description copied from interface: AmazonCloudFormation

  request - The input for the ExecuteChangeSet action. - `com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest`

  returns: Result of the ExecuteChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult`"
  (^com.amazonaws.services.cloudformation.model.ExecuteChangeSetResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ExecuteChangeSetRequest request]
    (-> this (.executeChangeSet request))))

(defn delete-stack-instances
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest`

  returns: Result of the DeleteStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult`"
  (^com.amazonaws.services.cloudformation.model.DeleteStackInstancesResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DeleteStackInstancesRequest request]
    (-> this (.deleteStackInstances request))))

(defn update-termination-protection
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest`

  returns: Result of the UpdateTerminationProtection operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult`"
  (^com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.UpdateTerminationProtectionRequest request]
    (-> this (.updateTerminationProtection request))))

(defn list-stack-set-operations
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest`

  returns: Result of the ListStackSetOperations operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult`"
  (^com.amazonaws.services.cloudformation.model.ListStackSetOperationsResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationsRequest request]
    (-> this (.listStackSetOperations request))))

(defn list-stack-instances
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.ListStackInstancesRequest`

  returns: Result of the ListStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackInstancesResult`"
  (^com.amazonaws.services.cloudformation.model.ListStackInstancesResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStackInstancesRequest request]
    (-> this (.listStackInstances request))))

(defn list-imports
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.ListImportsRequest`

  returns: Result of the ListImports operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListImportsResult`"
  (^com.amazonaws.services.cloudformation.model.ListImportsResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListImportsRequest request]
    (-> this (.listImports request))))

(defn delete-change-set
  "Description copied from interface: AmazonCloudFormation

  request - The input for the DeleteChangeSet action. - `com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest`

  returns: Result of the DeleteChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteChangeSetResult`"
  (^com.amazonaws.services.cloudformation.model.DeleteChangeSetResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DeleteChangeSetRequest request]
    (-> this (.deleteChangeSet request))))

(defn signal-resource
  "Description copied from interface: AmazonCloudFormation

  request - The input for the SignalResource action. - `com.amazonaws.services.cloudformation.model.SignalResourceRequest`

  returns: Result of the SignalResource operation returned by the service. - `com.amazonaws.services.cloudformation.model.SignalResourceResult`"
  (^com.amazonaws.services.cloudformation.model.SignalResourceResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.SignalResourceRequest request]
    (-> this (.signalResource request))))

(defn set-stack-policy
  "Description copied from interface: AmazonCloudFormation

  request - The input for the SetStackPolicy action. - `com.amazonaws.services.cloudformation.model.SetStackPolicyRequest`

  returns: Result of the SetStackPolicy operation returned by the service. - `com.amazonaws.services.cloudformation.model.SetStackPolicyResult`"
  (^com.amazonaws.services.cloudformation.model.SetStackPolicyResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.SetStackPolicyRequest request]
    (-> this (.setStackPolicy request))))

(defn list-stack-resources
  "Description copied from interface: AmazonCloudFormation

  request - The input for the ListStackResource action. - `com.amazonaws.services.cloudformation.model.ListStackResourcesRequest`

  returns: Result of the ListStackResources operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackResourcesResult`"
  (^com.amazonaws.services.cloudformation.model.ListStackResourcesResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStackResourcesRequest request]
    (-> this (.listStackResources request))))

(defn create-stack-instances
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest`

  returns: Result of the CreateStackInstances operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateStackInstancesResult`"
  (^com.amazonaws.services.cloudformation.model.CreateStackInstancesResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.CreateStackInstancesRequest request]
    (-> this (.createStackInstances request))))

(defn create-stack
  "Description copied from interface: AmazonCloudFormation

  request - The input for CreateStack action. - `com.amazonaws.services.cloudformation.model.CreateStackRequest`

  returns: Result of the CreateStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateStackResult`"
  (^com.amazonaws.services.cloudformation.model.CreateStackResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.CreateStackRequest request]
    (-> this (.createStack request))))

(defn list-stacks
  "Description copied from interface: AmazonCloudFormation

  request - The input for ListStacks action. - `com.amazonaws.services.cloudformation.model.ListStacksRequest`

  returns: Result of the ListStacks operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStacksResult`"
  (^com.amazonaws.services.cloudformation.model.ListStacksResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStacksRequest request]
    (-> this (.listStacks request)))
  (^com.amazonaws.services.cloudformation.model.ListStacksResult [^AbstractAmazonCloudFormation this]
    (-> this (.listStacks))))

(defn shutdown
  "Description copied from interface: AmazonCloudFormation"
  ([^AbstractAmazonCloudFormation this]
    (-> this (.shutdown))))

(defn describe-stack-resource-drifts
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest`

  returns: Result of the DescribeStackResourceDrifts operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackResourceDriftsRequest request]
    (-> this (.describeStackResourceDrifts request))))

(defn list-change-sets
  "Description copied from interface: AmazonCloudFormation

  request - The input for the ListChangeSets action. - `com.amazonaws.services.cloudformation.model.ListChangeSetsRequest`

  returns: Result of the ListChangeSets operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListChangeSetsResult`"
  (^com.amazonaws.services.cloudformation.model.ListChangeSetsResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListChangeSetsRequest request]
    (-> this (.listChangeSets request))))

(defn describe-account-limits
  "Description copied from interface: AmazonCloudFormation

  request - The input for the DescribeAccountLimits action. - `com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest`

  returns: Result of the DescribeAccountLimits operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeAccountLimitsResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeAccountLimitsRequest request]
    (-> this (.describeAccountLimits request))))

(defn stop-stack-set-operation
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest`

  returns: Result of the StopStackSetOperation operation returned by the service. - `com.amazonaws.services.cloudformation.model.StopStackSetOperationResult`"
  (^com.amazonaws.services.cloudformation.model.StopStackSetOperationResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.StopStackSetOperationRequest request]
    (-> this (.stopStackSetOperation request))))

(defn delete-stack
  "Description copied from interface: AmazonCloudFormation

  request - The input for DeleteStack action. - `com.amazonaws.services.cloudformation.model.DeleteStackRequest`

  returns: Result of the DeleteStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteStackResult`"
  (^com.amazonaws.services.cloudformation.model.DeleteStackResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DeleteStackRequest request]
    (-> this (.deleteStack request))))

(defn set-endpoint
  "Description copied from interface: AmazonCloudFormation

  endpoint - The endpoint (ex: \"cloudformation.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://cloudformation.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonCloudFormation this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-template
  "Description copied from interface: AmazonCloudFormation

  request - The input for a GetTemplate action. - `com.amazonaws.services.cloudformation.model.GetTemplateRequest`

  returns: Result of the GetTemplate operation returned by the service. - `com.amazonaws.services.cloudformation.model.GetTemplateResult`"
  (^com.amazonaws.services.cloudformation.model.GetTemplateResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.GetTemplateRequest request]
    (-> this (.getTemplate request))))

(defn describe-stack-resources
  "Description copied from interface: AmazonCloudFormation

  request - The input for DescribeStackResources action. - `com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest`

  returns: Result of the DescribeStackResources operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackResourcesResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackResourcesRequest request]
    (-> this (.describeStackResources request))))

(defn describe-stack-set-operation
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest`

  returns: Result of the DescribeStackSetOperation operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackSetOperationResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackSetOperationRequest request]
    (-> this (.describeStackSetOperation request))))

(defn list-stack-set-operation-results
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest`

  returns: Result of the ListStackSetOperationResults operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult`"
  (^com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStackSetOperationResultsRequest request]
    (-> this (.listStackSetOperationResults request))))

(defn describe-stack-events
  "Description copied from interface: AmazonCloudFormation

  request - The input for DescribeStackEvents action. - `com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest`

  returns: Result of the DescribeStackEvents operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackEventsResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackEventsResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest request]
    (-> this (.describeStackEvents request))))

(defn estimate-template-cost
  "Description copied from interface: AmazonCloudFormation

  request - The input for an EstimateTemplateCost action. - `com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest`

  returns: Result of the EstimateTemplateCost operation returned by the service. - `com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult`"
  (^com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.EstimateTemplateCostRequest request]
    (-> this (.estimateTemplateCost request)))
  (^com.amazonaws.services.cloudformation.model.EstimateTemplateCostResult [^AbstractAmazonCloudFormation this]
    (-> this (.estimateTemplateCost))))

(defn describe-stack-set
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.DescribeStackSetRequest`

  returns: Result of the DescribeStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackSetResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackSetResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackSetRequest request]
    (-> this (.describeStackSet request))))

(defn continue-update-rollback
  "Description copied from interface: AmazonCloudFormation

  request - The input for the ContinueUpdateRollback action. - `com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest`

  returns: Result of the ContinueUpdateRollback operation returned by the service. - `com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult`"
  (^com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ContinueUpdateRollbackRequest request]
    (-> this (.continueUpdateRollback request))))

(defn get-template-summary
  "Description copied from interface: AmazonCloudFormation

  request - The input for the GetTemplateSummary action. - `com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest`

  returns: Result of the GetTemplateSummary operation returned by the service. - `com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult`"
  (^com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.GetTemplateSummaryRequest request]
    (-> this (.getTemplateSummary request)))
  (^com.amazonaws.services.cloudformation.model.GetTemplateSummaryResult [^AbstractAmazonCloudFormation this]
    (-> this (.getTemplateSummary))))

(defn list-exports
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.ListExportsRequest`

  returns: Result of the ListExports operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListExportsResult`"
  (^com.amazonaws.services.cloudformation.model.ListExportsResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListExportsRequest request]
    (-> this (.listExports request))))

(defn cancel-update-stack
  "Description copied from interface: AmazonCloudFormation

  request - The input for the CancelUpdateStack action. - `com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest`

  returns: Result of the CancelUpdateStack operation returned by the service. - `com.amazonaws.services.cloudformation.model.CancelUpdateStackResult`"
  (^com.amazonaws.services.cloudformation.model.CancelUpdateStackResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.CancelUpdateStackRequest request]
    (-> this (.cancelUpdateStack request))))

(defn update-stack-set
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.UpdateStackSetRequest`

  returns: Result of the UpdateStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.UpdateStackSetResult`"
  (^com.amazonaws.services.cloudformation.model.UpdateStackSetResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.UpdateStackSetRequest request]
    (-> this (.updateStackSet request))))

(defn describe-change-set
  "Description copied from interface: AmazonCloudFormation

  request - The input for the DescribeChangeSet action. - `com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest`

  returns: Result of the DescribeChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeChangeSetResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeChangeSetResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeChangeSetRequest request]
    (-> this (.describeChangeSet request))))

(defn list-stack-sets
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.ListStackSetsRequest`

  returns: Result of the ListStackSets operation returned by the service. - `com.amazonaws.services.cloudformation.model.ListStackSetsResult`"
  (^com.amazonaws.services.cloudformation.model.ListStackSetsResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.ListStackSetsRequest request]
    (-> this (.listStackSets request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonCloudFormation

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonCloudFormation this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-change-set
  "Description copied from interface: AmazonCloudFormation

  request - The input for the CreateChangeSet action. - `com.amazonaws.services.cloudformation.model.CreateChangeSetRequest`

  returns: Result of the CreateChangeSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.CreateChangeSetResult`"
  (^com.amazonaws.services.cloudformation.model.CreateChangeSetResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.CreateChangeSetRequest request]
    (-> this (.createChangeSet request))))

(defn describe-stack-instance
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest`

  returns: Result of the DescribeStackInstance operation returned by the service. - `com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult`"
  (^com.amazonaws.services.cloudformation.model.DescribeStackInstanceResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DescribeStackInstanceRequest request]
    (-> this (.describeStackInstance request))))

(defn delete-stack-set
  "Description copied from interface: AmazonCloudFormation

  request - `com.amazonaws.services.cloudformation.model.DeleteStackSetRequest`

  returns: Result of the DeleteStackSet operation returned by the service. - `com.amazonaws.services.cloudformation.model.DeleteStackSetResult`"
  (^com.amazonaws.services.cloudformation.model.DeleteStackSetResult [^AbstractAmazonCloudFormation this ^com.amazonaws.services.cloudformation.model.DeleteStackSetRequest request]
    (-> this (.deleteStackSet request))))

