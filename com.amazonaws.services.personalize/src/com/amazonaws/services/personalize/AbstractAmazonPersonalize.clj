(ns com.amazonaws.services.personalize.AbstractAmazonPersonalize
  "Abstract implementation of AmazonPersonalize. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalize AbstractAmazonPersonalize]))

(defn describe-algorithm
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeAlgorithmRequest`

  returns: Result of the DescribeAlgorithm operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeAlgorithmResult`"
  (^com.amazonaws.services.personalize.model.DescribeAlgorithmResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeAlgorithmRequest request]
    (-> this (.describeAlgorithm request))))

(defn describe-schema
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeSchemaRequest`

  returns: Result of the DescribeSchema operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeSchemaResult`"
  (^com.amazonaws.services.personalize.model.DescribeSchemaResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeSchemaRequest request]
    (-> this (.describeSchema request))))

(defn list-event-trackers
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.ListEventTrackersRequest`

  returns: Result of the ListEventTrackers operation returned by the service. - `com.amazonaws.services.personalize.model.ListEventTrackersResult`"
  (^com.amazonaws.services.personalize.model.ListEventTrackersResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.ListEventTrackersRequest request]
    (-> this (.listEventTrackers request))))

(defn list-dataset-import-jobs
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.ListDatasetImportJobsRequest`

  returns: Result of the ListDatasetImportJobs operation returned by the service. - `com.amazonaws.services.personalize.model.ListDatasetImportJobsResult`"
  (^com.amazonaws.services.personalize.model.ListDatasetImportJobsResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.ListDatasetImportJobsRequest request]
    (-> this (.listDatasetImportJobs request))))

(defn create-solution-version
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.CreateSolutionVersionRequest`

  returns: Result of the CreateSolutionVersion operation returned by the service. - `com.amazonaws.services.personalize.model.CreateSolutionVersionResult`"
  (^com.amazonaws.services.personalize.model.CreateSolutionVersionResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateSolutionVersionRequest request]
    (-> this (.createSolutionVersion request))))

(defn describe-solution-version
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeSolutionVersionRequest`

  returns: Result of the DescribeSolutionVersion operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeSolutionVersionResult`"
  (^com.amazonaws.services.personalize.model.DescribeSolutionVersionResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeSolutionVersionRequest request]
    (-> this (.describeSolutionVersion request))))

(defn create-dataset
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.CreateDatasetRequest`

  returns: Result of the CreateDataset operation returned by the service. - `com.amazonaws.services.personalize.model.CreateDatasetResult`"
  (^com.amazonaws.services.personalize.model.CreateDatasetResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateDatasetRequest request]
    (-> this (.createDataset request))))

(defn create-dataset-group
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.CreateDatasetGroupRequest`

  returns: Result of the CreateDatasetGroup operation returned by the service. - `com.amazonaws.services.personalize.model.CreateDatasetGroupResult`"
  (^com.amazonaws.services.personalize.model.CreateDatasetGroupResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateDatasetGroupRequest request]
    (-> this (.createDatasetGroup request))))

(defn create-event-tracker
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.CreateEventTrackerRequest`

  returns: Result of the CreateEventTracker operation returned by the service. - `com.amazonaws.services.personalize.model.CreateEventTrackerResult`"
  (^com.amazonaws.services.personalize.model.CreateEventTrackerResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateEventTrackerRequest request]
    (-> this (.createEventTracker request))))

(defn get-solution-metrics
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.GetSolutionMetricsRequest`

  returns: Result of the GetSolutionMetrics operation returned by the service. - `com.amazonaws.services.personalize.model.GetSolutionMetricsResult`"
  (^com.amazonaws.services.personalize.model.GetSolutionMetricsResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.GetSolutionMetricsRequest request]
    (-> this (.getSolutionMetrics request))))

(defn describe-event-tracker
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeEventTrackerRequest`

  returns: Result of the DescribeEventTracker operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeEventTrackerResult`"
  (^com.amazonaws.services.personalize.model.DescribeEventTrackerResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeEventTrackerRequest request]
    (-> this (.describeEventTracker request))))

(defn describe-solution
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeSolutionRequest`

  returns: Result of the DescribeSolution operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeSolutionResult`"
  (^com.amazonaws.services.personalize.model.DescribeSolutionResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeSolutionRequest request]
    (-> this (.describeSolution request))))

(defn delete-campaign
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DeleteCampaignRequest`

  returns: Result of the DeleteCampaign operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteCampaignResult`"
  (^com.amazonaws.services.personalize.model.DeleteCampaignResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteCampaignRequest request]
    (-> this (.deleteCampaign request))))

(defn describe-dataset
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeDatasetRequest`

  returns: Result of the DescribeDataset operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeDatasetResult`"
  (^com.amazonaws.services.personalize.model.DescribeDatasetResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeDatasetRequest request]
    (-> this (.describeDataset request))))

(defn list-datasets
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.ListDatasetsRequest`

  returns: Result of the ListDatasets operation returned by the service. - `com.amazonaws.services.personalize.model.ListDatasetsResult`"
  (^com.amazonaws.services.personalize.model.ListDatasetsResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.ListDatasetsRequest request]
    (-> this (.listDatasets request))))

(defn create-dataset-import-job
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.CreateDatasetImportJobRequest`

  returns: Result of the CreateDatasetImportJob operation returned by the service. - `com.amazonaws.services.personalize.model.CreateDatasetImportJobResult`"
  (^com.amazonaws.services.personalize.model.CreateDatasetImportJobResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateDatasetImportJobRequest request]
    (-> this (.createDatasetImportJob request))))

(defn list-dataset-groups
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.ListDatasetGroupsRequest`

  returns: Result of the ListDatasetGroups operation returned by the service. - `com.amazonaws.services.personalize.model.ListDatasetGroupsResult`"
  (^com.amazonaws.services.personalize.model.ListDatasetGroupsResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.ListDatasetGroupsRequest request]
    (-> this (.listDatasetGroups request))))

(defn describe-campaign
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeCampaignRequest`

  returns: Result of the DescribeCampaign operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeCampaignResult`"
  (^com.amazonaws.services.personalize.model.DescribeCampaignResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeCampaignRequest request]
    (-> this (.describeCampaign request))))

(defn shutdown
  "Description copied from interface: AmazonPersonalize"
  ([^AbstractAmazonPersonalize this]
    (-> this (.shutdown))))

(defn describe-recipe
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeRecipeRequest`

  returns: Result of the DescribeRecipe operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeRecipeResult`"
  (^com.amazonaws.services.personalize.model.DescribeRecipeResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeRecipeRequest request]
    (-> this (.describeRecipe request))))

(defn describe-dataset-group
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeDatasetGroupRequest`

  returns: Result of the DescribeDatasetGroup operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeDatasetGroupResult`"
  (^com.amazonaws.services.personalize.model.DescribeDatasetGroupResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeDatasetGroupRequest request]
    (-> this (.describeDatasetGroup request))))

(defn delete-solution
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DeleteSolutionRequest`

  returns: Result of the DeleteSolution operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteSolutionResult`"
  (^com.amazonaws.services.personalize.model.DeleteSolutionResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteSolutionRequest request]
    (-> this (.deleteSolution request))))

(defn list-recipes
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.ListRecipesRequest`

  returns: Result of the ListRecipes operation returned by the service. - `com.amazonaws.services.personalize.model.ListRecipesResult`"
  (^com.amazonaws.services.personalize.model.ListRecipesResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.ListRecipesRequest request]
    (-> this (.listRecipes request))))

(defn list-solution-versions
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.ListSolutionVersionsRequest`

  returns: Result of the ListSolutionVersions operation returned by the service. - `com.amazonaws.services.personalize.model.ListSolutionVersionsResult`"
  (^com.amazonaws.services.personalize.model.ListSolutionVersionsResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.ListSolutionVersionsRequest request]
    (-> this (.listSolutionVersions request))))

(defn create-campaign
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.CreateCampaignRequest`

  returns: Result of the CreateCampaign operation returned by the service. - `com.amazonaws.services.personalize.model.CreateCampaignResult`"
  (^com.amazonaws.services.personalize.model.CreateCampaignResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateCampaignRequest request]
    (-> this (.createCampaign request))))

(defn create-solution
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.CreateSolutionRequest`

  returns: Result of the CreateSolution operation returned by the service. - `com.amazonaws.services.personalize.model.CreateSolutionResult`"
  (^com.amazonaws.services.personalize.model.CreateSolutionResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateSolutionRequest request]
    (-> this (.createSolution request))))

(defn update-campaign
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.UpdateCampaignRequest`

  returns: Result of the UpdateCampaign operation returned by the service. - `com.amazonaws.services.personalize.model.UpdateCampaignResult`"
  (^com.amazonaws.services.personalize.model.UpdateCampaignResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.UpdateCampaignRequest request]
    (-> this (.updateCampaign request))))

(defn create-schema
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.CreateSchemaRequest`

  returns: Result of the CreateSchema operation returned by the service. - `com.amazonaws.services.personalize.model.CreateSchemaResult`"
  (^com.amazonaws.services.personalize.model.CreateSchemaResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.CreateSchemaRequest request]
    (-> this (.createSchema request))))

(defn describe-feature-transformation
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeFeatureTransformationRequest`

  returns: Result of the DescribeFeatureTransformation operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeFeatureTransformationResult`"
  (^com.amazonaws.services.personalize.model.DescribeFeatureTransformationResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeFeatureTransformationRequest request]
    (-> this (.describeFeatureTransformation request))))

(defn list-solutions
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.ListSolutionsRequest`

  returns: Result of the ListSolutions operation returned by the service. - `com.amazonaws.services.personalize.model.ListSolutionsResult`"
  (^com.amazonaws.services.personalize.model.ListSolutionsResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.ListSolutionsRequest request]
    (-> this (.listSolutions request))))

(defn describe-dataset-import-job
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DescribeDatasetImportJobRequest`

  returns: Result of the DescribeDatasetImportJob operation returned by the service. - `com.amazonaws.services.personalize.model.DescribeDatasetImportJobResult`"
  (^com.amazonaws.services.personalize.model.DescribeDatasetImportJobResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DescribeDatasetImportJobRequest request]
    (-> this (.describeDatasetImportJob request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonPersonalize

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonPersonalize this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-event-tracker
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DeleteEventTrackerRequest`

  returns: Result of the DeleteEventTracker operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteEventTrackerResult`"
  (^com.amazonaws.services.personalize.model.DeleteEventTrackerResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteEventTrackerRequest request]
    (-> this (.deleteEventTracker request))))

(defn delete-dataset
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DeleteDatasetRequest`

  returns: Result of the DeleteDataset operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteDatasetResult`"
  (^com.amazonaws.services.personalize.model.DeleteDatasetResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteDatasetRequest request]
    (-> this (.deleteDataset request))))

(defn delete-schema
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DeleteSchemaRequest`

  returns: Result of the DeleteSchema operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteSchemaResult`"
  (^com.amazonaws.services.personalize.model.DeleteSchemaResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteSchemaRequest request]
    (-> this (.deleteSchema request))))

(defn delete-dataset-group
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.DeleteDatasetGroupRequest`

  returns: Result of the DeleteDatasetGroup operation returned by the service. - `com.amazonaws.services.personalize.model.DeleteDatasetGroupResult`"
  (^com.amazonaws.services.personalize.model.DeleteDatasetGroupResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.DeleteDatasetGroupRequest request]
    (-> this (.deleteDatasetGroup request))))

(defn list-campaigns
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.ListCampaignsRequest`

  returns: Result of the ListCampaigns operation returned by the service. - `com.amazonaws.services.personalize.model.ListCampaignsResult`"
  (^com.amazonaws.services.personalize.model.ListCampaignsResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.ListCampaignsRequest request]
    (-> this (.listCampaigns request))))

(defn list-schemas
  "Description copied from interface: AmazonPersonalize

  request - `com.amazonaws.services.personalize.model.ListSchemasRequest`

  returns: Result of the ListSchemas operation returned by the service. - `com.amazonaws.services.personalize.model.ListSchemasResult`"
  (^com.amazonaws.services.personalize.model.ListSchemasResult [^AbstractAmazonPersonalize this ^com.amazonaws.services.personalize.model.ListSchemasRequest request]
    (-> this (.listSchemas request))))

