(ns com.amazonaws.services.inspector.AbstractAmazonInspectorAsync
  "Abstract implementation of AmazonInspectorAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.inspector AbstractAmazonInspectorAsync]))

(defn stop-assessment-run-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.StopAssessmentRunRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopAssessmentRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.StopAssessmentRunResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.StopAssessmentRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopAssessmentRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.StopAssessmentRunRequest request]
    (-> this (.stopAssessmentRunAsync request))))

(defn list-rules-packages-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.ListRulesPackagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRulesPackages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListRulesPackagesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListRulesPackagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRulesPackagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListRulesPackagesRequest request]
    (-> this (.listRulesPackagesAsync request))))

(defn create-assessment-template-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAssessmentTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.CreateAssessmentTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAssessmentTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateAssessmentTemplateRequest request]
    (-> this (.createAssessmentTemplateAsync request))))

(defn describe-exclusions-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DescribeExclusionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExclusions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeExclusionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeExclusionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExclusionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeExclusionsRequest request]
    (-> this (.describeExclusionsAsync request))))

(defn delete-assessment-target-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAssessmentTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DeleteAssessmentTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAssessmentTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentTargetRequest request]
    (-> this (.deleteAssessmentTargetAsync request))))

(defn remove-attributes-from-findings-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveAttributesFromFindings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeAttributesFromFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.RemoveAttributesFromFindingsRequest request]
    (-> this (.removeAttributesFromFindingsAsync request))))

(defn list-event-subscriptions-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListEventSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventSubscriptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListEventSubscriptionsRequest request]
    (-> this (.listEventSubscriptionsAsync request))))

(defn describe-resource-groups-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResourceGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeResourceGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResourceGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeResourceGroupsRequest request]
    (-> this (.describeResourceGroupsAsync request))))

(defn list-assessment-targets-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssessmentTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListAssessmentTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssessmentTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentTargetsRequest request]
    (-> this (.listAssessmentTargetsAsync request))))

(defn get-assessment-report-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.GetAssessmentReportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAssessmentReport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.GetAssessmentReportResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetAssessmentReportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAssessmentReportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetAssessmentReportRequest request]
    (-> this (.getAssessmentReportAsync request))))

(defn get-exclusions-preview-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExclusionsPreview operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.GetExclusionsPreviewResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExclusionsPreviewAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetExclusionsPreviewRequest request]
    (-> this (.getExclusionsPreviewAsync request))))

(defn add-attributes-to-findings-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddAttributesToFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.AddAttributesToFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addAttributesToFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.AddAttributesToFindingsRequest request]
    (-> this (.addAttributesToFindingsAsync request))))

(defn list-assessment-run-agents-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssessmentRunAgents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListAssessmentRunAgentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssessmentRunAgentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentRunAgentsRequest request]
    (-> this (.listAssessmentRunAgentsAsync request))))

(defn create-assessment-target-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAssessmentTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.CreateAssessmentTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAssessmentTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateAssessmentTargetRequest request]
    (-> this (.createAssessmentTargetAsync request))))

(defn unsubscribe-from-event-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnsubscribeFromEvent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.UnsubscribeFromEventResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unsubscribeFromEventAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.UnsubscribeFromEventRequest request]
    (-> this (.unsubscribeFromEventAsync request))))

(defn describe-assessment-templates-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssessmentTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssessmentTemplatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentTemplatesRequest request]
    (-> this (.describeAssessmentTemplatesAsync request))))

(defn create-exclusions-preview-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateExclusionsPreview operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.CreateExclusionsPreviewResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createExclusionsPreviewAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateExclusionsPreviewRequest request]
    (-> this (.createExclusionsPreviewAsync request))))

(defn describe-rules-packages-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRulesPackages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeRulesPackagesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRulesPackagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeRulesPackagesRequest request]
    (-> this (.describeRulesPackagesAsync request))))

(defn list-assessment-templates-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssessmentTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListAssessmentTemplatesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssessmentTemplatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentTemplatesRequest request]
    (-> this (.listAssessmentTemplatesAsync request))))

(defn start-assessment-run-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.StartAssessmentRunRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartAssessmentRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.StartAssessmentRunResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.StartAssessmentRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startAssessmentRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.StartAssessmentRunRequest request]
    (-> this (.startAssessmentRunAsync request))))

(defn list-assessment-runs-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.ListAssessmentRunsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAssessmentRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListAssessmentRunsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentRunsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAssessmentRunsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListAssessmentRunsRequest request]
    (-> this (.listAssessmentRunsAsync request))))

(defn delete-assessment-run-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAssessmentRun operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DeleteAssessmentRunResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAssessmentRunAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentRunRequest request]
    (-> this (.deleteAssessmentRunAsync request))))

(defn update-assessment-target-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAssessmentTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.UpdateAssessmentTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAssessmentTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.UpdateAssessmentTargetRequest request]
    (-> this (.updateAssessmentTargetAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn describe-assessment-targets-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssessmentTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeAssessmentTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssessmentTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentTargetsRequest request]
    (-> this (.describeAssessmentTargetsAsync request))))

(defn list-exclusions-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.ListExclusionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListExclusions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListExclusionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListExclusionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listExclusionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListExclusionsRequest request]
    (-> this (.listExclusionsAsync request))))

(defn get-telemetry-metadata-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTelemetryMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.GetTelemetryMetadataResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTelemetryMetadataAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.GetTelemetryMetadataRequest request]
    (-> this (.getTelemetryMetadataAsync request))))

(defn describe-assessment-runs-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAssessmentRuns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeAssessmentRunsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAssessmentRunsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeAssessmentRunsRequest request]
    (-> this (.describeAssessmentRunsAsync request))))

(defn subscribe-to-event-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.SubscribeToEventRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SubscribeToEvent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.SubscribeToEventResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.SubscribeToEventRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.subscribeToEventAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.SubscribeToEventRequest request]
    (-> this (.subscribeToEventAsync request))))

(defn describe-findings-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DescribeFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeFindingsRequest request]
    (-> this (.describeFindingsAsync request))))

(defn set-tags-for-resource-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.SetTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.SetTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.SetTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.SetTagsForResourceRequest request]
    (-> this (.setTagsForResourceAsync request))))

(defn delete-assessment-template-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAssessmentTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DeleteAssessmentTemplateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAssessmentTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DeleteAssessmentTemplateRequest request]
    (-> this (.deleteAssessmentTemplateAsync request))))

(defn list-findings-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.ListFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.ListFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.ListFindingsRequest request]
    (-> this (.listFindingsAsync request))))

(defn register-cross-account-access-role-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterCrossAccountAccessRole operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerCrossAccountAccessRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.RegisterCrossAccountAccessRoleRequest request]
    (-> this (.registerCrossAccountAccessRoleAsync request))))

(defn preview-agents-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.PreviewAgentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PreviewAgents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.PreviewAgentsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.PreviewAgentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.previewAgentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.PreviewAgentsRequest request]
    (-> this (.previewAgentsAsync request))))

(defn create-resource-group-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.CreateResourceGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.CreateResourceGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateResourceGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.CreateResourceGroupRequest request]
    (-> this (.createResourceGroupAsync request))))

(defn describe-cross-account-access-role-async
  "Description copied from interface: AmazonInspectorAsync

  request - `com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCrossAccountAccessRole operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCrossAccountAccessRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonInspectorAsync this ^com.amazonaws.services.inspector.model.DescribeCrossAccountAccessRoleRequest request]
    (-> this (.describeCrossAccountAccessRoleAsync request))))

