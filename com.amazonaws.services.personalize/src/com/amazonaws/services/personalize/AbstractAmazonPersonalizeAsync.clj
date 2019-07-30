(ns com.amazonaws.services.personalize.AbstractAmazonPersonalizeAsync
  "Abstract implementation of AmazonPersonalizeAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalize AbstractAmazonPersonalizeAsync]))

(defn delete-dataset-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DeleteDatasetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteDatasetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteDatasetRequest request]
    (-> this (.deleteDatasetAsync request))))

(defn describe-dataset-group-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeDatasetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDatasetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeDatasetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatasetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetGroupRequest request]
    (-> this (.describeDatasetGroupAsync request))))

(defn list-solutions-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.ListSolutionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSolutions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListSolutionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSolutionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSolutionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSolutionsRequest request]
    (-> this (.listSolutionsAsync request))))

(defn delete-campaign-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DeleteCampaignRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteCampaignResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteCampaignRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCampaignAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteCampaignRequest request]
    (-> this (.deleteCampaignAsync request))))

(defn describe-feature-transformation-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeFeatureTransformationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFeatureTransformation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeFeatureTransformationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeFeatureTransformationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFeatureTransformationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeFeatureTransformationRequest request]
    (-> this (.describeFeatureTransformationAsync request))))

(defn describe-solution-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeSolutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSolution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeSolutionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSolutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSolutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSolutionRequest request]
    (-> this (.describeSolutionAsync request))))

(defn delete-dataset-group-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DeleteDatasetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDatasetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteDatasetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteDatasetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDatasetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteDatasetGroupRequest request]
    (-> this (.deleteDatasetGroupAsync request))))

(defn describe-campaign-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeCampaignRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeCampaignResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeCampaignRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCampaignAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeCampaignRequest request]
    (-> this (.describeCampaignAsync request))))

(defn list-campaigns-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.ListCampaignsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCampaigns operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListCampaignsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListCampaignsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCampaignsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListCampaignsRequest request]
    (-> this (.listCampaignsAsync request))))

(defn list-event-trackers-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.ListEventTrackersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventTrackers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListEventTrackersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListEventTrackersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventTrackersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListEventTrackersRequest request]
    (-> this (.listEventTrackersAsync request))))

(defn list-solution-versions-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.ListSolutionVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSolutionVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListSolutionVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSolutionVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSolutionVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSolutionVersionsRequest request]
    (-> this (.listSolutionVersionsAsync request))))

(defn describe-dataset-import-job-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeDatasetImportJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDatasetImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeDatasetImportJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetImportJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatasetImportJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetImportJobRequest request]
    (-> this (.describeDatasetImportJobAsync request))))

(defn get-solution-metrics-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.GetSolutionMetricsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSolutionMetrics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.GetSolutionMetricsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.GetSolutionMetricsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSolutionMetricsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.GetSolutionMetricsRequest request]
    (-> this (.getSolutionMetricsAsync request))))

(defn create-event-tracker-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.CreateEventTrackerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventTracker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateEventTrackerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateEventTrackerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventTrackerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateEventTrackerRequest request]
    (-> this (.createEventTrackerAsync request))))

(defn list-datasets-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.ListDatasetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListDatasetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetsRequest request]
    (-> this (.listDatasetsAsync request))))

(defn create-dataset-import-job-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.CreateDatasetImportJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDatasetImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateDatasetImportJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetImportJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatasetImportJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetImportJobRequest request]
    (-> this (.createDatasetImportJobAsync request))))

(defn create-campaign-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.CreateCampaignRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateCampaignResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateCampaignRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCampaignAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateCampaignRequest request]
    (-> this (.createCampaignAsync request))))

(defn describe-event-tracker-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeEventTrackerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventTracker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeEventTrackerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeEventTrackerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventTrackerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeEventTrackerRequest request]
    (-> this (.describeEventTrackerAsync request))))

(defn describe-schema-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeSchemaResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSchemaRequest request]
    (-> this (.describeSchemaAsync request))))

(defn create-solution-version-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.CreateSolutionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSolutionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateSolutionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSolutionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSolutionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSolutionVersionRequest request]
    (-> this (.createSolutionVersionAsync request))))

(defn list-recipes-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.ListRecipesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRecipes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListRecipesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListRecipesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRecipesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListRecipesRequest request]
    (-> this (.listRecipesAsync request))))

(defn describe-algorithm-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeAlgorithmRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlgorithm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeAlgorithmResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeAlgorithmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAlgorithmAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeAlgorithmRequest request]
    (-> this (.describeAlgorithmAsync request))))

(defn describe-solution-version-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeSolutionVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSolutionVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeSolutionVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSolutionVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSolutionVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeSolutionVersionRequest request]
    (-> this (.describeSolutionVersionAsync request))))

(defn describe-dataset-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeDatasetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeDatasetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeDatasetRequest request]
    (-> this (.describeDatasetAsync request))))

(defn delete-schema-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DeleteSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteSchemaResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteSchemaRequest request]
    (-> this (.deleteSchemaAsync request))))

(defn list-dataset-groups-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.ListDatasetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListDatasetGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetGroupsRequest request]
    (-> this (.listDatasetGroupsAsync request))))

(defn create-dataset-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.CreateDatasetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDataset operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateDatasetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatasetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetRequest request]
    (-> this (.createDatasetAsync request))))

(defn delete-solution-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DeleteSolutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSolution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteSolutionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteSolutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSolutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteSolutionRequest request]
    (-> this (.deleteSolutionAsync request))))

(defn delete-event-tracker-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DeleteEventTrackerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventTracker operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DeleteEventTrackerResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteEventTrackerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventTrackerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DeleteEventTrackerRequest request]
    (-> this (.deleteEventTrackerAsync request))))

(defn create-dataset-group-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.CreateDatasetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDatasetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateDatasetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDatasetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateDatasetGroupRequest request]
    (-> this (.createDatasetGroupAsync request))))

(defn create-schema-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.CreateSchemaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSchema operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateSchemaResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSchemaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSchemaAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSchemaRequest request]
    (-> this (.createSchemaAsync request))))

(defn update-campaign-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.UpdateCampaignRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCampaign operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.UpdateCampaignResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.UpdateCampaignRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCampaignAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.UpdateCampaignRequest request]
    (-> this (.updateCampaignAsync request))))

(defn list-dataset-import-jobs-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.ListDatasetImportJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDatasetImportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListDatasetImportJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetImportJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDatasetImportJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListDatasetImportJobsRequest request]
    (-> this (.listDatasetImportJobsAsync request))))

(defn describe-recipe-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.DescribeRecipeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRecipe operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.DescribeRecipeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeRecipeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRecipeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.DescribeRecipeRequest request]
    (-> this (.describeRecipeAsync request))))

(defn list-schemas-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.ListSchemasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSchemas operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.ListSchemasResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSchemasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSchemasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.ListSchemasRequest request]
    (-> this (.listSchemasAsync request))))

(defn create-solution-async
  "Description copied from interface: AmazonPersonalizeAsync

  request - `com.amazonaws.services.personalize.model.CreateSolutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSolution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalize.model.CreateSolutionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSolutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSolutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeAsync this ^com.amazonaws.services.personalize.model.CreateSolutionRequest request]
    (-> this (.createSolutionAsync request))))

