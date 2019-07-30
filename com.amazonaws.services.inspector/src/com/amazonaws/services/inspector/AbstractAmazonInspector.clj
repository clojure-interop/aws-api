(ns com.amazonaws.services.inspector.AbstractAmazonInspector
  "Abstract implementation of AmazonInspector. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.inspector AbstractAmazonInspector]))

(defn list-findings
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.ListFindingsRequest`

  returns: Result of the ListFindings operation returned by the service. - `com.amazonaws.services.inspector.model.ListFindingsResult`"
  (^com.amazonaws.services.inspector.model.ListFindingsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.ListFindingsRequest request]
    (-> this (.listFindings request))))

(defn update-assessment-target
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest`

  returns: Result of the UpdateAssessmentTarget operation returned by the service. - `com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult`"
  (^com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest request]
    (-> this (.updateAssessmentTarget request))))

(defn list-assessment-runs
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.ListAssessmentRunsRequest`

  returns: Result of the ListAssessmentRuns operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentRunsResult`"
  (^com.amazonaws.services.inspector.model.ListAssessmentRunsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.ListAssessmentRunsRequest request]
    (-> this (.listAssessmentRuns request))))

(defn preview-agents
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.PreviewAgentsRequest`

  returns: Result of the PreviewAgents operation returned by the service. - `com.amazonaws.services.inspector.model.PreviewAgentsResult`"
  (^com.amazonaws.services.inspector.model.PreviewAgentsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.PreviewAgentsRequest request]
    (-> this (.previewAgents request))))

(defn delete-assessment-template
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest`

  returns: Result of the DeleteAssessmentTemplate operation returned by the service. - `com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult`"
  (^com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest request]
    (-> this (.deleteAssessmentTemplate request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.inspector.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.inspector.model.ListTagsForResourceResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn create-resource-group
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.CreateResourceGroupRequest`

  returns: Result of the CreateResourceGroup operation returned by the service. - `com.amazonaws.services.inspector.model.CreateResourceGroupResult`"
  (^com.amazonaws.services.inspector.model.CreateResourceGroupResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.CreateResourceGroupRequest request]
    (-> this (.createResourceGroup request))))

(defn set-region
  "Description copied from interface: AmazonInspector

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonInspector this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn set-tags-for-resource
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.SetTagsForResourceRequest`

  returns: Result of the SetTagsForResource operation returned by the service. - `com.amazonaws.services.inspector.model.SetTagsForResourceResult`"
  (^com.amazonaws.services.inspector.model.SetTagsForResourceResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.SetTagsForResourceRequest request]
    (-> this (.setTagsForResource request))))

(defn unsubscribe-from-event
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest`

  returns: Result of the UnsubscribeFromEvent operation returned by the service. - `com.amazonaws.services.inspector.model.UnsubscribeFromEventResult`"
  (^com.amazonaws.services.inspector.model.UnsubscribeFromEventResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest request]
    (-> this (.unsubscribeFromEvent request))))

(defn describe-exclusions
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DescribeExclusionsRequest`

  returns: Result of the DescribeExclusions operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeExclusionsResult`"
  (^com.amazonaws.services.inspector.model.DescribeExclusionsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DescribeExclusionsRequest request]
    (-> this (.describeExclusions request))))

(defn list-exclusions
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.ListExclusionsRequest`

  returns: Result of the ListExclusions operation returned by the service. - `com.amazonaws.services.inspector.model.ListExclusionsResult`"
  (^com.amazonaws.services.inspector.model.ListExclusionsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.ListExclusionsRequest request]
    (-> this (.listExclusions request))))

(defn get-assessment-report
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.GetAssessmentReportRequest`

  returns: Result of the GetAssessmentReport operation returned by the service. - `com.amazonaws.services.inspector.model.GetAssessmentReportResult`"
  (^com.amazonaws.services.inspector.model.GetAssessmentReportResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.GetAssessmentReportRequest request]
    (-> this (.getAssessmentReport request))))

(defn add-attributes-to-findings
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest`

  returns: Result of the AddAttributesToFindings operation returned by the service. - `com.amazonaws.services.inspector.model.AddAttributesToFindingsResult`"
  (^com.amazonaws.services.inspector.model.AddAttributesToFindingsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest request]
    (-> this (.addAttributesToFindings request))))

(defn describe-assessment-templates
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest`

  returns: Result of the DescribeAssessmentTemplates operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult`"
  (^com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest request]
    (-> this (.describeAssessmentTemplates request))))

(defn list-assessment-run-agents
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest`

  returns: Result of the ListAssessmentRunAgents operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult`"
  (^com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest request]
    (-> this (.listAssessmentRunAgents request))))

(defn delete-assessment-run
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest`

  returns: Result of the DeleteAssessmentRun operation returned by the service. - `com.amazonaws.services.inspector.model.DeleteAssessmentRunResult`"
  (^com.amazonaws.services.inspector.model.DeleteAssessmentRunResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest request]
    (-> this (.deleteAssessmentRun request))))

(defn get-exclusions-preview
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest`

  returns: Result of the GetExclusionsPreview operation returned by the service. - `com.amazonaws.services.inspector.model.GetExclusionsPreviewResult`"
  (^com.amazonaws.services.inspector.model.GetExclusionsPreviewResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest request]
    (-> this (.getExclusionsPreview request))))

(defn start-assessment-run
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.StartAssessmentRunRequest`

  returns: Result of the StartAssessmentRun operation returned by the service. - `com.amazonaws.services.inspector.model.StartAssessmentRunResult`"
  (^com.amazonaws.services.inspector.model.StartAssessmentRunResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.StartAssessmentRunRequest request]
    (-> this (.startAssessmentRun request))))

(defn describe-findings
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DescribeFindingsRequest`

  returns: Result of the DescribeFindings operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeFindingsResult`"
  (^com.amazonaws.services.inspector.model.DescribeFindingsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DescribeFindingsRequest request]
    (-> this (.describeFindings request))))

(defn shutdown
  "Description copied from interface: AmazonInspector"
  ([^AbstractAmazonInspector this]
    (-> this (.shutdown))))

(defn register-cross-account-access-role
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest`

  returns: Result of the RegisterCrossAccountAccessRole operation returned by the service. - `com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult`"
  (^com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest request]
    (-> this (.registerCrossAccountAccessRole request))))

(defn list-event-subscriptions
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest`

  returns: Result of the ListEventSubscriptions operation returned by the service. - `com.amazonaws.services.inspector.model.ListEventSubscriptionsResult`"
  (^com.amazonaws.services.inspector.model.ListEventSubscriptionsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest request]
    (-> this (.listEventSubscriptions request))))

(defn delete-assessment-target
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest`

  returns: Result of the DeleteAssessmentTarget operation returned by the service. - `com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult`"
  (^com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest request]
    (-> this (.deleteAssessmentTarget request))))

(defn subscribe-to-event
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.SubscribeToEventRequest`

  returns: Result of the SubscribeToEvent operation returned by the service. - `com.amazonaws.services.inspector.model.SubscribeToEventResult`"
  (^com.amazonaws.services.inspector.model.SubscribeToEventResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.SubscribeToEventRequest request]
    (-> this (.subscribeToEvent request))))

(defn create-exclusions-preview
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest`

  returns: Result of the CreateExclusionsPreview operation returned by the service. - `com.amazonaws.services.inspector.model.CreateExclusionsPreviewResult`"
  (^com.amazonaws.services.inspector.model.CreateExclusionsPreviewResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest request]
    (-> this (.createExclusionsPreview request))))

(defn set-endpoint
  "Description copied from interface: AmazonInspector

  endpoint - The endpoint (ex: \"inspector.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://inspector.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonInspector this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-assessment-targets
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest`

  returns: Result of the DescribeAssessmentTargets operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult`"
  (^com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest request]
    (-> this (.describeAssessmentTargets request))))

(defn describe-resource-groups
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest`

  returns: Result of the DescribeResourceGroups operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeResourceGroupsResult`"
  (^com.amazonaws.services.inspector.model.DescribeResourceGroupsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest request]
    (-> this (.describeResourceGroups request))))

(defn remove-attributes-from-findings
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest`

  returns: Result of the RemoveAttributesFromFindings operation returned by the service. - `com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult`"
  (^com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest request]
    (-> this (.removeAttributesFromFindings request))))

(defn describe-assessment-runs
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest`

  returns: Result of the DescribeAssessmentRuns operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult`"
  (^com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest request]
    (-> this (.describeAssessmentRuns request))))

(defn create-assessment-template
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest`

  returns: Result of the CreateAssessmentTemplate operation returned by the service. - `com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult`"
  (^com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest request]
    (-> this (.createAssessmentTemplate request))))

(defn create-assessment-target
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest`

  returns: Result of the CreateAssessmentTarget operation returned by the service. - `com.amazonaws.services.inspector.model.CreateAssessmentTargetResult`"
  (^com.amazonaws.services.inspector.model.CreateAssessmentTargetResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest request]
    (-> this (.createAssessmentTarget request))))

(defn list-assessment-templates
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest`

  returns: Result of the ListAssessmentTemplates operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult`"
  (^com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest request]
    (-> this (.listAssessmentTemplates request))))

(defn list-rules-packages
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.ListRulesPackagesRequest`

  returns: Result of the ListRulesPackages operation returned by the service. - `com.amazonaws.services.inspector.model.ListRulesPackagesResult`"
  (^com.amazonaws.services.inspector.model.ListRulesPackagesResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.ListRulesPackagesRequest request]
    (-> this (.listRulesPackages request))))

(defn describe-rules-packages
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest`

  returns: Result of the DescribeRulesPackages operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeRulesPackagesResult`"
  (^com.amazonaws.services.inspector.model.DescribeRulesPackagesResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest request]
    (-> this (.describeRulesPackages request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonInspector

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonInspector this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-cross-account-access-role
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest`

  returns: Result of the DescribeCrossAccountAccessRole operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult`"
  (^com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest request]
    (-> this (.describeCrossAccountAccessRole request))))

(defn get-telemetry-metadata
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest`

  returns: Result of the GetTelemetryMetadata operation returned by the service. - `com.amazonaws.services.inspector.model.GetTelemetryMetadataResult`"
  (^com.amazonaws.services.inspector.model.GetTelemetryMetadataResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest request]
    (-> this (.getTelemetryMetadata request))))

(defn stop-assessment-run
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.StopAssessmentRunRequest`

  returns: Result of the StopAssessmentRun operation returned by the service. - `com.amazonaws.services.inspector.model.StopAssessmentRunResult`"
  (^com.amazonaws.services.inspector.model.StopAssessmentRunResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.StopAssessmentRunRequest request]
    (-> this (.stopAssessmentRun request))))

(defn list-assessment-targets
  "Description copied from interface: AmazonInspector

  request - `com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest`

  returns: Result of the ListAssessmentTargets operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentTargetsResult`"
  (^com.amazonaws.services.inspector.model.ListAssessmentTargetsResult [^AbstractAmazonInspector this ^com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest request]
    (-> this (.listAssessmentTargets request))))

