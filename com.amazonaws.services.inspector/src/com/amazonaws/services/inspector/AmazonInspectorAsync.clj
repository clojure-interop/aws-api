(ns com.amazonaws.services.inspector.AmazonInspectorAsync
  "Interface for accessing Amazon Inspector asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonInspectorAsync instead.


  Amazon Inspector

  Amazon Inspector enables you to analyze the behavior of your AWS resources and to identify potential security issues.
  For more information, see  Amazon Inspector User
  Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.inspector AmazonInspectorAsync]))

(defn stop-assessment-run-async
  "Stops the assessment run that is specified by the ARN of the assessment run.

  stop-assessment-run-request - `com.amazonaws.services.inspector.model.StopAssessmentRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopAssessmentRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.StopAssessmentRunResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.StopAssessmentRunRequest stop-assessment-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopAssessmentRunAsync stop-assessment-run-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.StopAssessmentRunRequest stop-assessment-run-request]
    (-> this (.stopAssessmentRunAsync stop-assessment-run-request))))

(defn list-rules-packages-async
  "Lists all available Amazon Inspector rules packages.

  list-rules-packages-request - `com.amazonaws.services.inspector.model.ListRulesPackagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRulesPackages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListRulesPackagesResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListRulesPackagesRequest list-rules-packages-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRulesPackagesAsync list-rules-packages-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListRulesPackagesRequest list-rules-packages-request]
    (-> this (.listRulesPackagesAsync list-rules-packages-request))))

(defn create-assessment-template-async
  "Creates an assessment template for the assessment target that is specified by the ARN of the assessment target.
   If the service-linked
   role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon
   Inspector access to AWS Services needed to perform security assessments.

  create-assessment-template-request - `com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAssessmentTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest create-assessment-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAssessmentTemplateAsync create-assessment-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest create-assessment-template-request]
    (-> this (.createAssessmentTemplateAsync create-assessment-template-request))))

(defn describe-exclusions-async
  "Describes the exclusions that are specified by the exclusions' ARNs.

  describe-exclusions-request - `com.amazonaws.services.inspector.model.DescribeExclusionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExclusions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeExclusionsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeExclusionsRequest describe-exclusions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExclusionsAsync describe-exclusions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeExclusionsRequest describe-exclusions-request]
    (-> this (.describeExclusionsAsync describe-exclusions-request))))

(defn delete-assessment-target-async
  "Deletes the assessment target that is specified by the ARN of the assessment target.

  delete-assessment-target-request - `com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAssessmentTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest delete-assessment-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAssessmentTargetAsync delete-assessment-target-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest delete-assessment-target-request]
    (-> this (.deleteAssessmentTargetAsync delete-assessment-target-request))))

(defn remove-attributes-from-findings-async
  "Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings
   where an attribute with the specified key exists.

  remove-attributes-from-findings-request - `com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveAttributesFromFindings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest remove-attributes-from-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeAttributesFromFindingsAsync remove-attributes-from-findings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest remove-attributes-from-findings-request]
    (-> this (.removeAttributesFromFindingsAsync remove-attributes-from-findings-request))))

(defn list-event-subscriptions-async
  "Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment
   template. For more information, see SubscribeToEvent and UnsubscribeFromEvent.

  list-event-subscriptions-request - `com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListEventSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest list-event-subscriptions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventSubscriptionsAsync list-event-subscriptions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest list-event-subscriptions-request]
    (-> this (.listEventSubscriptionsAsync list-event-subscriptions-request))))

(defn describe-resource-groups-async
  "Describes the resource groups that are specified by the ARNs of the resource groups.

  describe-resource-groups-request - `com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResourceGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeResourceGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest describe-resource-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResourceGroupsAsync describe-resource-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest describe-resource-groups-request]
    (-> this (.describeResourceGroupsAsync describe-resource-groups-request))))

(defn list-assessment-targets-async
  "Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets,
   see Amazon Inspector
   Assessment Targets.

  list-assessment-targets-request - `com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssessmentTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListAssessmentTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest list-assessment-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssessmentTargetsAsync list-assessment-targets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest list-assessment-targets-request]
    (-> this (.listAssessmentTargetsAsync list-assessment-targets-request))))

(defn get-assessment-report-async
  "Produces an assessment report that includes detailed and comprehensive results of a specified assessment run.

  get-assessment-report-request - `com.amazonaws.services.inspector.model.GetAssessmentReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAssessmentReport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.GetAssessmentReportResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetAssessmentReportRequest get-assessment-report-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAssessmentReportAsync get-assessment-report-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetAssessmentReportRequest get-assessment-report-request]
    (-> this (.getAssessmentReportAsync get-assessment-report-request))))

(defn get-exclusions-preview-async
  "Retrieves the exclusions preview (a list of ExclusionPreview objects) specified by the preview token. You can
   obtain the preview token by running the CreateExclusionsPreview API.

  get-exclusions-preview-request - `com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExclusionsPreview operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.GetExclusionsPreviewResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest get-exclusions-preview-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExclusionsPreviewAsync get-exclusions-preview-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest get-exclusions-preview-request]
    (-> this (.getExclusionsPreviewAsync get-exclusions-preview-request))))

(defn add-attributes-to-findings-async
  "Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.

  add-attributes-to-findings-request - `com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddAttributesToFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.AddAttributesToFindingsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest add-attributes-to-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addAttributesToFindingsAsync add-attributes-to-findings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest add-attributes-to-findings-request]
    (-> this (.addAttributesToFindingsAsync add-attributes-to-findings-request))))

(defn list-assessment-run-agents-async
  "Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.

  list-assessment-run-agents-request - `com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssessmentRunAgents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest list-assessment-run-agents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssessmentRunAgentsAsync list-assessment-run-agents-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest list-assessment-run-agents-request]
    (-> this (.listAssessmentRunAgentsAsync list-assessment-run-agents-request))))

(defn create-assessment-target-async
  "Creates a new assessment target using the ARN of the resource group that is generated by
   CreateResourceGroup. If resourceGroupArn is not specified, all EC2 instances in the current AWS account
   and region are included in the assessment target. If the service-linked role isn’t
   already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access
   to AWS Services needed to perform security assessments. You can create up to 50 assessment targets per AWS
   account. You can run up to 500 concurrent agents per AWS account. For more information, see  Amazon Inspector
   Assessment Targets.

  create-assessment-target-request - `com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAssessmentTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.CreateAssessmentTargetResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest create-assessment-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAssessmentTargetAsync create-assessment-target-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest create-assessment-target-request]
    (-> this (.createAssessmentTargetAsync create-assessment-target-request))))

(defn unsubscribe-from-event-async
  "Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
   a specified SNS topic.

  unsubscribe-from-event-request - `com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnsubscribeFromEvent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.UnsubscribeFromEventResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest unsubscribe-from-event-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unsubscribeFromEventAsync unsubscribe-from-event-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest unsubscribe-from-event-request]
    (-> this (.unsubscribeFromEventAsync unsubscribe-from-event-request))))

(defn describe-assessment-templates-async
  "Describes the assessment templates that are specified by the ARNs of the assessment templates.

  describe-assessment-templates-request - `com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssessmentTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest describe-assessment-templates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssessmentTemplatesAsync describe-assessment-templates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest describe-assessment-templates-request]
    (-> this (.describeAssessmentTemplatesAsync describe-assessment-templates-request))))

(defn create-exclusions-preview-async
  "Starts the generation of an exclusions preview for the specified assessment template. The exclusions preview
   lists the potential exclusions (ExclusionPreview) that Inspector can detect before it runs the assessment.

  create-exclusions-preview-request - `com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateExclusionsPreview operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.CreateExclusionsPreviewResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest create-exclusions-preview-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createExclusionsPreviewAsync create-exclusions-preview-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest create-exclusions-preview-request]
    (-> this (.createExclusionsPreviewAsync create-exclusions-preview-request))))

(defn describe-rules-packages-async
  "Describes the rules packages that are specified by the ARNs of the rules packages.

  describe-rules-packages-request - `com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRulesPackages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeRulesPackagesResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest describe-rules-packages-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRulesPackagesAsync describe-rules-packages-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest describe-rules-packages-request]
    (-> this (.describeRulesPackagesAsync describe-rules-packages-request))))

(defn list-assessment-templates-async
  "Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the
   assessment targets.

  list-assessment-templates-request - `com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssessmentTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest list-assessment-templates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssessmentTemplatesAsync list-assessment-templates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest list-assessment-templates-request]
    (-> this (.listAssessmentTemplatesAsync list-assessment-templates-request))))

(defn start-assessment-run-async
  "Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you
   must not exceed the limit of running up to 500 concurrent agents per AWS account.

  start-assessment-run-request - `com.amazonaws.services.inspector.model.StartAssessmentRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartAssessmentRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.StartAssessmentRunResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.StartAssessmentRunRequest start-assessment-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startAssessmentRunAsync start-assessment-run-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.StartAssessmentRunRequest start-assessment-run-request]
    (-> this (.startAssessmentRunAsync start-assessment-run-request))))

(defn list-assessment-runs-async
  "Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the
   assessment templates.

  list-assessment-runs-request - `com.amazonaws.services.inspector.model.ListAssessmentRunsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssessmentRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListAssessmentRunsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentRunsRequest list-assessment-runs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssessmentRunsAsync list-assessment-runs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentRunsRequest list-assessment-runs-request]
    (-> this (.listAssessmentRunsAsync list-assessment-runs-request))))

(defn delete-assessment-run-async
  "Deletes the assessment run that is specified by the ARN of the assessment run.

  delete-assessment-run-request - `com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAssessmentRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DeleteAssessmentRunResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest delete-assessment-run-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAssessmentRunAsync delete-assessment-run-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest delete-assessment-run-request]
    (-> this (.deleteAssessmentRunAsync delete-assessment-run-request))))

(defn update-assessment-target-async
  "Updates the assessment target that is specified by the ARN of the assessment target.


   If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the
   assessment target.

  update-assessment-target-request - `com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAssessmentTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest update-assessment-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAssessmentTargetAsync update-assessment-target-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest update-assessment-target-request]
    (-> this (.updateAssessmentTargetAsync update-assessment-target-request))))

(defn list-tags-for-resource-async
  "Lists all tags associated with an assessment template.

  list-tags-for-resource-request - `com.amazonaws.services.inspector.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn describe-assessment-targets-async
  "Describes the assessment targets that are specified by the ARNs of the assessment targets.

  describe-assessment-targets-request - `com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssessmentTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest describe-assessment-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssessmentTargetsAsync describe-assessment-targets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest describe-assessment-targets-request]
    (-> this (.describeAssessmentTargetsAsync describe-assessment-targets-request))))

(defn list-exclusions-async
  "List exclusions that are generated by the assessment run.

  list-exclusions-request - `com.amazonaws.services.inspector.model.ListExclusionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListExclusions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListExclusionsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListExclusionsRequest list-exclusions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listExclusionsAsync list-exclusions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListExclusionsRequest list-exclusions-request]
    (-> this (.listExclusionsAsync list-exclusions-request))))

(defn get-telemetry-metadata-async
  "Information about the data that is collected for the specified assessment run.

  get-telemetry-metadata-request - `com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTelemetryMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.GetTelemetryMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest get-telemetry-metadata-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTelemetryMetadataAsync get-telemetry-metadata-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest get-telemetry-metadata-request]
    (-> this (.getTelemetryMetadataAsync get-telemetry-metadata-request))))

(defn describe-assessment-runs-async
  "Describes the assessment runs that are specified by the ARNs of the assessment runs.

  describe-assessment-runs-request - `com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssessmentRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest describe-assessment-runs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssessmentRunsAsync describe-assessment-runs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest describe-assessment-runs-request]
    (-> this (.describeAssessmentRunsAsync describe-assessment-runs-request))))

(defn subscribe-to-event-async
  "Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
   a specified SNS topic.

  subscribe-to-event-request - `com.amazonaws.services.inspector.model.SubscribeToEventRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SubscribeToEvent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.SubscribeToEventResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.SubscribeToEventRequest subscribe-to-event-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.subscribeToEventAsync subscribe-to-event-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.SubscribeToEventRequest subscribe-to-event-request]
    (-> this (.subscribeToEventAsync subscribe-to-event-request))))

(defn describe-findings-async
  "Describes the findings that are specified by the ARNs of the findings.

  describe-findings-request - `com.amazonaws.services.inspector.model.DescribeFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeFindingsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeFindingsRequest describe-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFindingsAsync describe-findings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeFindingsRequest describe-findings-request]
    (-> this (.describeFindingsAsync describe-findings-request))))

(defn set-tags-for-resource-async
  "Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment
   template.

  set-tags-for-resource-request - `com.amazonaws.services.inspector.model.SetTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.SetTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.SetTagsForResourceRequest set-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTagsForResourceAsync set-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.SetTagsForResourceRequest set-tags-for-resource-request]
    (-> this (.setTagsForResourceAsync set-tags-for-resource-request))))

(defn delete-assessment-template-async
  "Deletes the assessment template that is specified by the ARN of the assessment template.

  delete-assessment-template-request - `com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAssessmentTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest delete-assessment-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAssessmentTemplateAsync delete-assessment-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest delete-assessment-template-request]
    (-> this (.deleteAssessmentTemplateAsync delete-assessment-template-request))))

(defn list-findings-async
  "Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.

  list-findings-request - `com.amazonaws.services.inspector.model.ListFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListFindingsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListFindingsRequest list-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFindingsAsync list-findings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListFindingsRequest list-findings-request]
    (-> this (.listFindingsAsync list-findings-request))))

(defn register-cross-account-access-role-async
  "Registers the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
   assessments.

  register-cross-account-access-role-request - `com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterCrossAccountAccessRole operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest register-cross-account-access-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerCrossAccountAccessRoleAsync register-cross-account-access-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest register-cross-account-access-role-request]
    (-> this (.registerCrossAccountAccessRoleAsync register-cross-account-access-role-request))))

(defn preview-agents-async
  "Previews the agents installed on the EC2 instances that are part of the specified assessment target.

  preview-agents-request - `com.amazonaws.services.inspector.model.PreviewAgentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PreviewAgents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.PreviewAgentsResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.PreviewAgentsRequest preview-agents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.previewAgentsAsync preview-agents-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.PreviewAgentsRequest preview-agents-request]
    (-> this (.previewAgentsAsync preview-agents-request))))

(defn create-resource-group-async
  "Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2
   instances to be included in an Amazon Inspector assessment target. The created resource group is then used to
   create an Amazon Inspector assessment target. For more information, see CreateAssessmentTarget.

  create-resource-group-request - `com.amazonaws.services.inspector.model.CreateResourceGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.CreateResourceGroupResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateResourceGroupRequest create-resource-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceGroupAsync create-resource-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateResourceGroupRequest create-resource-group-request]
    (-> this (.createResourceGroupAsync create-resource-group-request))))

(defn describe-cross-account-access-role-async
  "Describes the IAM role that enables Amazon Inspector to access your AWS account.

  describe-cross-account-access-role-request - `com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCrossAccountAccessRole operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult>`"
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest describe-cross-account-access-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCrossAccountAccessRoleAsync describe-cross-account-access-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest describe-cross-account-access-role-request]
    (-> this (.describeCrossAccountAccessRoleAsync describe-cross-account-access-role-request))))

