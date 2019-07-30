(ns com.amazonaws.services.inspector.AmazonInspectorClient
  "Client for accessing Amazon Inspector. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Amazon Inspector

  Amazon Inspector enables you to analyze the behavior of your AWS resources and to identify potential security issues.
  For more information, see  Amazon Inspector User
  Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.inspector AmazonInspectorClient]))

(defn ->amazon-inspector-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Inspector (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonInspectorClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonInspectorClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonInspectorClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonInspectorClient aws-credentials client-configuration))
  (^AmazonInspectorClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonInspectorClient client-configuration))
  (^AmazonInspectorClient []
    (new AmazonInspectorClient )))

(defn *builder
  "returns: `com.amazonaws.services.inspector.AmazonInspectorClientBuilder`"
  (^com.amazonaws.services.inspector.AmazonInspectorClientBuilder []
    (AmazonInspectorClient/builder )))

(defn list-findings
  "Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.

  request - `com.amazonaws.services.inspector.model.ListFindingsRequest`

  returns: Result of the ListFindings operation returned by the service. - `com.amazonaws.services.inspector.model.ListFindingsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListFindingsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.ListFindingsRequest request]
    (-> this (.listFindings request))))

(defn update-assessment-target
  "Updates the assessment target that is specified by the ARN of the assessment target.


   If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the
   assessment target.

  request - `com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest`

  returns: Result of the UpdateAssessmentTarget operation returned by the service. - `com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest request]
    (-> this (.updateAssessmentTarget request))))

(defn list-assessment-runs
  "Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the
   assessment templates.

  request - `com.amazonaws.services.inspector.model.ListAssessmentRunsRequest`

  returns: Result of the ListAssessmentRuns operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentRunsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListAssessmentRunsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.ListAssessmentRunsRequest request]
    (-> this (.listAssessmentRuns request))))

(defn preview-agents
  "Previews the agents installed on the EC2 instances that are part of the specified assessment target.

  request - `com.amazonaws.services.inspector.model.PreviewAgentsRequest`

  returns: Result of the PreviewAgents operation returned by the service. - `com.amazonaws.services.inspector.model.PreviewAgentsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.PreviewAgentsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.PreviewAgentsRequest request]
    (-> this (.previewAgents request))))

(defn delete-assessment-template
  "Deletes the assessment template that is specified by the ARN of the assessment template.

  request - `com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest`

  returns: Result of the DeleteAssessmentTemplate operation returned by the service. - `com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest request]
    (-> this (.deleteAssessmentTemplate request))))

(defn list-tags-for-resource
  "Lists all tags associated with an assessment template.

  request - `com.amazonaws.services.inspector.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.inspector.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListTagsForResourceResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn create-resource-group
  "Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2
   instances to be included in an Amazon Inspector assessment target. The created resource group is then used to
   create an Amazon Inspector assessment target. For more information, see CreateAssessmentTarget.

  request - `com.amazonaws.services.inspector.model.CreateResourceGroupRequest`

  returns: Result of the CreateResourceGroup operation returned by the service. - `com.amazonaws.services.inspector.model.CreateResourceGroupResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.CreateResourceGroupResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.CreateResourceGroupRequest request]
    (-> this (.createResourceGroup request))))

(defn set-tags-for-resource
  "Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment
   template.

  request - `com.amazonaws.services.inspector.model.SetTagsForResourceRequest`

  returns: Result of the SetTagsForResource operation returned by the service. - `com.amazonaws.services.inspector.model.SetTagsForResourceResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.SetTagsForResourceResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.SetTagsForResourceRequest request]
    (-> this (.setTagsForResource request))))

(defn unsubscribe-from-event
  "Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
   a specified SNS topic.

  request - `com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest`

  returns: Result of the UnsubscribeFromEvent operation returned by the service. - `com.amazonaws.services.inspector.model.UnsubscribeFromEventResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.UnsubscribeFromEventResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest request]
    (-> this (.unsubscribeFromEvent request))))

(defn describe-exclusions
  "Describes the exclusions that are specified by the exclusions' ARNs.

  request - `com.amazonaws.services.inspector.model.DescribeExclusionsRequest`

  returns: Result of the DescribeExclusions operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeExclusionsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeExclusionsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DescribeExclusionsRequest request]
    (-> this (.describeExclusions request))))

(defn list-exclusions
  "List exclusions that are generated by the assessment run.

  request - `com.amazonaws.services.inspector.model.ListExclusionsRequest`

  returns: Result of the ListExclusions operation returned by the service. - `com.amazonaws.services.inspector.model.ListExclusionsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListExclusionsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.ListExclusionsRequest request]
    (-> this (.listExclusions request))))

(defn get-assessment-report
  "Produces an assessment report that includes detailed and comprehensive results of a specified assessment run.

  request - `com.amazonaws.services.inspector.model.GetAssessmentReportRequest`

  returns: Result of the GetAssessmentReport operation returned by the service. - `com.amazonaws.services.inspector.model.GetAssessmentReportResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.GetAssessmentReportResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.GetAssessmentReportRequest request]
    (-> this (.getAssessmentReport request))))

(defn add-attributes-to-findings
  "Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.

  request - `com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest`

  returns: Result of the AddAttributesToFindings operation returned by the service. - `com.amazonaws.services.inspector.model.AddAttributesToFindingsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.AddAttributesToFindingsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest request]
    (-> this (.addAttributesToFindings request))))

(defn describe-assessment-templates
  "Describes the assessment templates that are specified by the ARNs of the assessment templates.

  request - `com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest`

  returns: Result of the DescribeAssessmentTemplates operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest request]
    (-> this (.describeAssessmentTemplates request))))

(defn list-assessment-run-agents
  "Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.

  request - `com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest`

  returns: Result of the ListAssessmentRunAgents operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest request]
    (-> this (.listAssessmentRunAgents request))))

(defn delete-assessment-run
  "Deletes the assessment run that is specified by the ARN of the assessment run.

  request - `com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest`

  returns: Result of the DeleteAssessmentRun operation returned by the service. - `com.amazonaws.services.inspector.model.DeleteAssessmentRunResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DeleteAssessmentRunResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest request]
    (-> this (.deleteAssessmentRun request))))

(defn get-exclusions-preview
  "Retrieves the exclusions preview (a list of ExclusionPreview objects) specified by the preview token. You can
   obtain the preview token by running the CreateExclusionsPreview API.

  request - `com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest`

  returns: Result of the GetExclusionsPreview operation returned by the service. - `com.amazonaws.services.inspector.model.GetExclusionsPreviewResult`

  throws: com.amazonaws.services.inspector.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.inspector.model.GetExclusionsPreviewResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest request]
    (-> this (.getExclusionsPreview request))))

(defn start-assessment-run
  "Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you
   must not exceed the limit of running up to 500 concurrent agents per AWS account.

  request - `com.amazonaws.services.inspector.model.StartAssessmentRunRequest`

  returns: Result of the StartAssessmentRun operation returned by the service. - `com.amazonaws.services.inspector.model.StartAssessmentRunResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.StartAssessmentRunResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.StartAssessmentRunRequest request]
    (-> this (.startAssessmentRun request))))

(defn describe-findings
  "Describes the findings that are specified by the ARNs of the findings.

  request - `com.amazonaws.services.inspector.model.DescribeFindingsRequest`

  returns: Result of the DescribeFindings operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeFindingsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeFindingsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DescribeFindingsRequest request]
    (-> this (.describeFindings request))))

(defn register-cross-account-access-role
  "Registers the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
   assessments.

  request - `com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest`

  returns: Result of the RegisterCrossAccountAccessRole operation returned by the service. - `com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest request]
    (-> this (.registerCrossAccountAccessRole request))))

(defn list-event-subscriptions
  "Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment
   template. For more information, see SubscribeToEvent and UnsubscribeFromEvent.

  request - `com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest`

  returns: Result of the ListEventSubscriptions operation returned by the service. - `com.amazonaws.services.inspector.model.ListEventSubscriptionsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListEventSubscriptionsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest request]
    (-> this (.listEventSubscriptions request))))

(defn delete-assessment-target
  "Deletes the assessment target that is specified by the ARN of the assessment target.

  request - `com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest`

  returns: Result of the DeleteAssessmentTarget operation returned by the service. - `com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest request]
    (-> this (.deleteAssessmentTarget request))))

(defn subscribe-to-event
  "Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
   a specified SNS topic.

  request - `com.amazonaws.services.inspector.model.SubscribeToEventRequest`

  returns: Result of the SubscribeToEvent operation returned by the service. - `com.amazonaws.services.inspector.model.SubscribeToEventResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.SubscribeToEventResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.SubscribeToEventRequest request]
    (-> this (.subscribeToEvent request))))

(defn create-exclusions-preview
  "Starts the generation of an exclusions preview for the specified assessment template. The exclusions preview
   lists the potential exclusions (ExclusionPreview) that Inspector can detect before it runs the assessment.

  request - `com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest`

  returns: Result of the CreateExclusionsPreview operation returned by the service. - `com.amazonaws.services.inspector.model.CreateExclusionsPreviewResult`

  throws: com.amazonaws.services.inspector.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.inspector.model.CreateExclusionsPreviewResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest request]
    (-> this (.createExclusionsPreview request))))

(defn describe-assessment-targets
  "Describes the assessment targets that are specified by the ARNs of the assessment targets.

  request - `com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest`

  returns: Result of the DescribeAssessmentTargets operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest request]
    (-> this (.describeAssessmentTargets request))))

(defn describe-resource-groups
  "Describes the resource groups that are specified by the ARNs of the resource groups.

  request - `com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest`

  returns: Result of the DescribeResourceGroups operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeResourceGroupsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeResourceGroupsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest request]
    (-> this (.describeResourceGroups request))))

(defn remove-attributes-from-findings
  "Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings
   where an attribute with the specified key exists.

  request - `com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest`

  returns: Result of the RemoveAttributesFromFindings operation returned by the service. - `com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest request]
    (-> this (.removeAttributesFromFindings request))))

(defn describe-assessment-runs
  "Describes the assessment runs that are specified by the ARNs of the assessment runs.

  request - `com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest`

  returns: Result of the DescribeAssessmentRuns operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest request]
    (-> this (.describeAssessmentRuns request))))

(defn create-assessment-template
  "Creates an assessment template for the assessment target that is specified by the ARN of the assessment target.
   If the service-linked
   role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon
   Inspector access to AWS Services needed to perform security assessments.

  request - `com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest`

  returns: Result of the CreateAssessmentTemplate operation returned by the service. - `com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest request]
    (-> this (.createAssessmentTemplate request))))

(defn create-assessment-target
  "Creates a new assessment target using the ARN of the resource group that is generated by
   CreateResourceGroup. If resourceGroupArn is not specified, all EC2 instances in the current AWS account
   and region are included in the assessment target. If the service-linked role isn’t
   already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access
   to AWS Services needed to perform security assessments. You can create up to 50 assessment targets per AWS
   account. You can run up to 500 concurrent agents per AWS account. For more information, see  Amazon Inspector
   Assessment Targets.

  request - `com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest`

  returns: Result of the CreateAssessmentTarget operation returned by the service. - `com.amazonaws.services.inspector.model.CreateAssessmentTargetResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.CreateAssessmentTargetResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest request]
    (-> this (.createAssessmentTarget request))))

(defn list-assessment-templates
  "Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the
   assessment targets.

  request - `com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest`

  returns: Result of the ListAssessmentTemplates operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest request]
    (-> this (.listAssessmentTemplates request))))

(defn list-rules-packages
  "Lists all available Amazon Inspector rules packages.

  request - `com.amazonaws.services.inspector.model.ListRulesPackagesRequest`

  returns: Result of the ListRulesPackages operation returned by the service. - `com.amazonaws.services.inspector.model.ListRulesPackagesResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListRulesPackagesResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.ListRulesPackagesRequest request]
    (-> this (.listRulesPackages request))))

(defn describe-rules-packages
  "Describes the rules packages that are specified by the ARNs of the rules packages.

  request - `com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest`

  returns: Result of the DescribeRulesPackages operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeRulesPackagesResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeRulesPackagesResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest request]
    (-> this (.describeRulesPackages request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonInspectorClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-cross-account-access-role
  "Describes the IAM role that enables Amazon Inspector to access your AWS account.

  request - `com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest`

  returns: Result of the DescribeCrossAccountAccessRole operation returned by the service. - `com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest request]
    (-> this (.describeCrossAccountAccessRole request))))

(defn get-telemetry-metadata
  "Information about the data that is collected for the specified assessment run.

  request - `com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest`

  returns: Result of the GetTelemetryMetadata operation returned by the service. - `com.amazonaws.services.inspector.model.GetTelemetryMetadataResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.GetTelemetryMetadataResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest request]
    (-> this (.getTelemetryMetadata request))))

(defn stop-assessment-run
  "Stops the assessment run that is specified by the ARN of the assessment run.

  request - `com.amazonaws.services.inspector.model.StopAssessmentRunRequest`

  returns: Result of the StopAssessmentRun operation returned by the service. - `com.amazonaws.services.inspector.model.StopAssessmentRunResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.StopAssessmentRunResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.StopAssessmentRunRequest request]
    (-> this (.stopAssessmentRun request))))

(defn list-assessment-targets
  "Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets,
   see Amazon Inspector
   Assessment Targets.

  request - `com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest`

  returns: Result of the ListAssessmentTargets operation returned by the service. - `com.amazonaws.services.inspector.model.ListAssessmentTargetsResult`

  throws: com.amazonaws.services.inspector.model.InternalException - Internal server error."
  (^com.amazonaws.services.inspector.model.ListAssessmentTargetsResult [^AmazonInspectorClient this ^com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest request]
    (-> this (.listAssessmentTargets request))))
