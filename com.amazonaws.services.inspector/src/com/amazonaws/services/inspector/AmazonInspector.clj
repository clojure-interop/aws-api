(ns com.amazonaws.services.inspector.AmazonInspector
  "Interface for accessing Amazon Inspector.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonInspector instead.


  Amazon Inspector

  Amazon Inspector enables you to analyze the behavior of your AWS resources and to identify potential security issues.
  For more information, see  Amazon Inspector User
  Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.inspector AmazonInspector]))

(defn list-findings
  "Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.

  list-findings-request - `com.amazonaws.services.inspector.model.ListFindingsRequest`

  returns: Result of the ListFindings operation returned by the service. - `com.amazonaws.services.inspector.model.ListFindingsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListFindingsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.ListFindingsRequest list-findings-request]
    (-> this (.listFindings list-findings-request))))

(defn update-assessment-target
  "Updates the assessment target that is specified by the ARN of the assessment target.


   If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the
   assessment target.

  update-assessment-target-request - `com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest`

  returns: Result of the UpdateAssessmentTarget operation returned by the service. - `com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest update-assessment-target-request]
    (-> this (.updateAssessmentTarget update-assessment-target-request))))

(defn list-assessment-runs
  "Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the
   assessment templates.

  list-assessment-runs-request - `com.amazonaws.services.inspector.model.ListAssessmentRunsRequest`

  returns: Result of the ListAssessmentRuns operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentRunsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListAssessmentRunsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.ListAssessmentRunsRequest list-assessment-runs-request]
    (-> this (.listAssessmentRuns list-assessment-runs-request))))

(defn preview-agents
  "Previews the agents installed on the EC2 instances that are part of the specified assessment target.

  preview-agents-request - `com.amazonaws.services.inspector.model.PreviewAgentsRequest`

  returns: Result of the PreviewAgents operation returned by the service. - `com.amazonaws.services.inspector.model.PreviewAgentsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.PreviewAgentsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.PreviewAgentsRequest preview-agents-request]
    (-> this (.previewAgents preview-agents-request))))

(defn delete-assessment-template
  "Deletes the assessment template that is specified by the ARN of the assessment template.

  delete-assessment-template-request - `com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest`

  returns: Result of the DeleteAssessmentTemplate operation returned by the service. - `com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest delete-assessment-template-request]
    (-> this (.deleteAssessmentTemplate delete-assessment-template-request))))

(defn list-tags-for-resource
  "Lists all tags associated with an assessment template.

  list-tags-for-resource-request - `com.amazonaws.services.inspector.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.inspector.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListTagsForResourceResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn create-resource-group
  "Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2
   instances to be included in an Amazon Inspector assessment target. The created resource group is then used to
   create an Amazon Inspector assessment target. For more information, see CreateAssessmentTarget.

  create-resource-group-request - `com.amazonaws.services.inspector.model.CreateResourceGroupRequest`

  returns: Result of the CreateResourceGroup operation returned by the service. - `com.amazonaws.services.inspector.model.CreateResourceGroupResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.CreateResourceGroupResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.CreateResourceGroupRequest create-resource-group-request]
    (-> this (.createResourceGroup create-resource-group-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonInspector this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn set-tags-for-resource
  "Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment
   template.

  set-tags-for-resource-request - `com.amazonaws.services.inspector.model.SetTagsForResourceRequest`

  returns: Result of the SetTagsForResource operation returned by the service. - `com.amazonaws.services.inspector.model.SetTagsForResourceResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.SetTagsForResourceResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.SetTagsForResourceRequest set-tags-for-resource-request]
    (-> this (.setTagsForResource set-tags-for-resource-request))))

(defn unsubscribe-from-event
  "Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
   a specified SNS topic.

  unsubscribe-from-event-request - `com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest`

  returns: Result of the UnsubscribeFromEvent operation returned by the service. - `com.amazonaws.services.inspector.model.UnsubscribeFromEventResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.UnsubscribeFromEventResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest unsubscribe-from-event-request]
    (-> this (.unsubscribeFromEvent unsubscribe-from-event-request))))

(defn describe-exclusions
  "Describes the exclusions that are specified by the exclusions' ARNs.

  describe-exclusions-request - `com.amazonaws.services.inspector.model.DescribeExclusionsRequest`

  returns: Result of the DescribeExclusions operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeExclusionsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeExclusionsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DescribeExclusionsRequest describe-exclusions-request]
    (-> this (.describeExclusions describe-exclusions-request))))

(defn list-exclusions
  "List exclusions that are generated by the assessment run.

  list-exclusions-request - `com.amazonaws.services.inspector.model.ListExclusionsRequest`

  returns: Result of the ListExclusions operation returned by the service. - `com.amazonaws.services.inspector.model.ListExclusionsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListExclusionsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.ListExclusionsRequest list-exclusions-request]
    (-> this (.listExclusions list-exclusions-request))))

(defn get-assessment-report
  "Produces an assessment report that includes detailed and comprehensive results of a specified assessment run.

  get-assessment-report-request - `com.amazonaws.services.inspector.model.GetAssessmentReportRequest`

  returns: Result of the GetAssessmentReport operation returned by the service. - `com.amazonaws.services.inspector.model.GetAssessmentReportResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.GetAssessmentReportResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.GetAssessmentReportRequest get-assessment-report-request]
    (-> this (.getAssessmentReport get-assessment-report-request))))

(defn add-attributes-to-findings
  "Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.

  add-attributes-to-findings-request - `com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest`

  returns: Result of the AddAttributesToFindings operation returned by the service. - `com.amazonaws.services.inspector.model.AddAttributesToFindingsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.AddAttributesToFindingsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest add-attributes-to-findings-request]
    (-> this (.addAttributesToFindings add-attributes-to-findings-request))))

(defn describe-assessment-templates
  "Describes the assessment templates that are specified by the ARNs of the assessment templates.

  describe-assessment-templates-request - `com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest`

  returns: Result of the DescribeAssessmentTemplates operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest describe-assessment-templates-request]
    (-> this (.describeAssessmentTemplates describe-assessment-templates-request))))

(defn list-assessment-run-agents
  "Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.

  list-assessment-run-agents-request - `com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest`

  returns: Result of the ListAssessmentRunAgents operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest list-assessment-run-agents-request]
    (-> this (.listAssessmentRunAgents list-assessment-run-agents-request))))

(defn delete-assessment-run
  "Deletes the assessment run that is specified by the ARN of the assessment run.

  delete-assessment-run-request - `com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest`

  returns: Result of the DeleteAssessmentRun operation returned by the service. - `com.amazonaws.services.inspector.model.DeleteAssessmentRunResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DeleteAssessmentRunResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest delete-assessment-run-request]
    (-> this (.deleteAssessmentRun delete-assessment-run-request))))

(defn get-exclusions-preview
  "Retrieves the exclusions preview (a list of ExclusionPreview objects) specified by the preview token. You can
   obtain the preview token by running the CreateExclusionsPreview API.

  get-exclusions-preview-request - `com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest`

  returns: Result of the GetExclusionsPreview operation returned by the service. - `com.amazonaws.services.inspector.model.GetExclusionsPreviewResult`

  throws: com.amazonaws.services.inspector.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.inspector.model.GetExclusionsPreviewResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest get-exclusions-preview-request]
    (-> this (.getExclusionsPreview get-exclusions-preview-request))))

(defn start-assessment-run
  "Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you
   must not exceed the limit of running up to 500 concurrent agents per AWS account.

  start-assessment-run-request - `com.amazonaws.services.inspector.model.StartAssessmentRunRequest`

  returns: Result of the StartAssessmentRun operation returned by the service. - `com.amazonaws.services.inspector.model.StartAssessmentRunResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.StartAssessmentRunResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.StartAssessmentRunRequest start-assessment-run-request]
    (-> this (.startAssessmentRun start-assessment-run-request))))

(defn describe-findings
  "Describes the findings that are specified by the ARNs of the findings.

  describe-findings-request - `com.amazonaws.services.inspector.model.DescribeFindingsRequest`

  returns: Result of the DescribeFindings operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeFindingsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeFindingsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DescribeFindingsRequest describe-findings-request]
    (-> this (.describeFindings describe-findings-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonInspector this]
    (-> this (.shutdown))))

(defn register-cross-account-access-role
  "Registers the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
   assessments.

  register-cross-account-access-role-request - `com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest`

  returns: Result of the RegisterCrossAccountAccessRole operation returned by the service. - `com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest register-cross-account-access-role-request]
    (-> this (.registerCrossAccountAccessRole register-cross-account-access-role-request))))

(defn list-event-subscriptions
  "Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment
   template. For more information, see SubscribeToEvent and UnsubscribeFromEvent.

  list-event-subscriptions-request - `com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest`

  returns: Result of the ListEventSubscriptions operation returned by the service. - `com.amazonaws.services.inspector.model.ListEventSubscriptionsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListEventSubscriptionsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest list-event-subscriptions-request]
    (-> this (.listEventSubscriptions list-event-subscriptions-request))))

(defn delete-assessment-target
  "Deletes the assessment target that is specified by the ARN of the assessment target.

  delete-assessment-target-request - `com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest`

  returns: Result of the DeleteAssessmentTarget operation returned by the service. - `com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest delete-assessment-target-request]
    (-> this (.deleteAssessmentTarget delete-assessment-target-request))))

(defn subscribe-to-event
  "Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
   a specified SNS topic.

  subscribe-to-event-request - `com.amazonaws.services.inspector.model.SubscribeToEventRequest`

  returns: Result of the SubscribeToEvent operation returned by the service. - `com.amazonaws.services.inspector.model.SubscribeToEventResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.SubscribeToEventResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.SubscribeToEventRequest subscribe-to-event-request]
    (-> this (.subscribeToEvent subscribe-to-event-request))))

(defn create-exclusions-preview
  "Starts the generation of an exclusions preview for the specified assessment template. The exclusions preview
   lists the potential exclusions (ExclusionPreview) that Inspector can detect before it runs the assessment.

  create-exclusions-preview-request - `com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest`

  returns: Result of the CreateExclusionsPreview operation returned by the service. - `com.amazonaws.services.inspector.model.CreateExclusionsPreviewResult`

  throws: com.amazonaws.services.inspector.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.inspector.model.CreateExclusionsPreviewResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest create-exclusions-preview-request]
    (-> this (.createExclusionsPreview create-exclusions-preview-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"inspector.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://inspector.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonInspector this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-assessment-targets
  "Describes the assessment targets that are specified by the ARNs of the assessment targets.

  describe-assessment-targets-request - `com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest`

  returns: Result of the DescribeAssessmentTargets operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest describe-assessment-targets-request]
    (-> this (.describeAssessmentTargets describe-assessment-targets-request))))

(defn describe-resource-groups
  "Describes the resource groups that are specified by the ARNs of the resource groups.

  describe-resource-groups-request - `com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest`

  returns: Result of the DescribeResourceGroups operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeResourceGroupsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeResourceGroupsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest describe-resource-groups-request]
    (-> this (.describeResourceGroups describe-resource-groups-request))))

(defn remove-attributes-from-findings
  "Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings
   where an attribute with the specified key exists.

  remove-attributes-from-findings-request - `com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest`

  returns: Result of the RemoveAttributesFromFindings operation returned by the service. - `com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest remove-attributes-from-findings-request]
    (-> this (.removeAttributesFromFindings remove-attributes-from-findings-request))))

(defn describe-assessment-runs
  "Describes the assessment runs that are specified by the ARNs of the assessment runs.

  describe-assessment-runs-request - `com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest`

  returns: Result of the DescribeAssessmentRuns operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest describe-assessment-runs-request]
    (-> this (.describeAssessmentRuns describe-assessment-runs-request))))

(defn create-assessment-template
  "Creates an assessment template for the assessment target that is specified by the ARN of the assessment target.
   If the service-linked
   role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon
   Inspector access to AWS Services needed to perform security assessments.

  create-assessment-template-request - `com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest`

  returns: Result of the CreateAssessmentTemplate operation returned by the service. - `com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest create-assessment-template-request]
    (-> this (.createAssessmentTemplate create-assessment-template-request))))

(defn create-assessment-target
  "Creates a new assessment target using the ARN of the resource group that is generated by
   CreateResourceGroup. If resourceGroupArn is not specified, all EC2 instances in the current AWS account
   and region are included in the assessment target. If the service-linked role isn’t
   already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access
   to AWS Services needed to perform security assessments. You can create up to 50 assessment targets per AWS
   account. You can run up to 500 concurrent agents per AWS account. For more information, see  Amazon Inspector
   Assessment Targets.

  create-assessment-target-request - `com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest`

  returns: Result of the CreateAssessmentTarget operation returned by the service. - `com.amazonaws.services.inspector.model.CreateAssessmentTargetResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.CreateAssessmentTargetResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest create-assessment-target-request]
    (-> this (.createAssessmentTarget create-assessment-target-request))))

(defn list-assessment-templates
  "Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the
   assessment targets.

  list-assessment-templates-request - `com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest`

  returns: Result of the ListAssessmentTemplates operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest list-assessment-templates-request]
    (-> this (.listAssessmentTemplates list-assessment-templates-request))))

(defn list-rules-packages
  "Lists all available Amazon Inspector rules packages.

  list-rules-packages-request - `com.amazonaws.services.inspector.model.ListRulesPackagesRequest`

  returns: Result of the ListRulesPackages operation returned by the service. - `com.amazonaws.services.inspector.model.ListRulesPackagesResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListRulesPackagesResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.ListRulesPackagesRequest list-rules-packages-request]
    (-> this (.listRulesPackages list-rules-packages-request))))

(defn describe-rules-packages
  "Describes the rules packages that are specified by the ARNs of the rules packages.

  describe-rules-packages-request - `com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest`

  returns: Result of the DescribeRulesPackages operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeRulesPackagesResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeRulesPackagesResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest describe-rules-packages-request]
    (-> this (.describeRulesPackages describe-rules-packages-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonInspector this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-cross-account-access-role
  "Describes the IAM role that enables Amazon Inspector to access your AWS account.

  describe-cross-account-access-role-request - `com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest`

  returns: Result of the DescribeCrossAccountAccessRole operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest describe-cross-account-access-role-request]
    (-> this (.describeCrossAccountAccessRole describe-cross-account-access-role-request))))

(defn get-telemetry-metadata
  "Information about the data that is collected for the specified assessment run.

  get-telemetry-metadata-request - `com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest`

  returns: Result of the GetTelemetryMetadata operation returned by the service. - `com.amazonaws.services.inspector.model.GetTelemetryMetadataResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.GetTelemetryMetadataResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest get-telemetry-metadata-request]
    (-> this (.getTelemetryMetadata get-telemetry-metadata-request))))

(defn stop-assessment-run
  "Stops the assessment run that is specified by the ARN of the assessment run.

  stop-assessment-run-request - `com.amazonaws.services.inspector.model.StopAssessmentRunRequest`

  returns: Result of the StopAssessmentRun operation returned by the service. - `com.amazonaws.services.inspector.model.StopAssessmentRunResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.StopAssessmentRunResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.StopAssessmentRunRequest stop-assessment-run-request]
    (-> this (.stopAssessmentRun stop-assessment-run-request))))

(defn list-assessment-targets
  "Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets,
   see Amazon Inspector
   Assessment Targets.

  list-assessment-targets-request - `com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest`

  returns: Result of the ListAssessmentTargets operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentTargetsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListAssessmentTargetsResult [^AmazonInspector this ^com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest list-assessment-targets-request]
    (-> this (.listAssessmentTargets list-assessment-targets-request))))

