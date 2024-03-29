(ns tree-data.core
  "These functions help with working with a tree data structure.  The
  type of data structure this library supports is one where the nodes
  have two items, a human readable string (the label), and an id.  The
  underlying data structure has two parts. The first is a hashmap,
  which maps id's to the label.  The second is the tree itself.  The
  tree contains only the id's.  There is also a variable called
  counter, which keeps the latest")

;; API
;; ---- in progress  ----
(defn add-child-node
  "Adds the *child*, below the parent, identified by *parent-id*, in the *tree*"
  [tree parent-id child]
  
  nil
  )

(defn get-label
  "Given a node id, it returns the human readable name."
  [tree node-id]
  nil
  ) 
;; ------ working -------

;; Helpers
;; ---- in progress  ----

(defn get-list-by-id
  "Given a tree and an id, it returns the list corresponding to the
  id.  It only looks in the first level of lists."
  [tree node-id]
  (for [curr-list tree
        :when (= node-id (first curr-list))]
    (println "fenton")
))
;; ------ working -------
(defn get-top-level-ids
  "Given a list of lists, extract the first elements of the lists and
  return a list of those elements"
  [list-of-lists]
  (map #(first %) list-of-lists))

