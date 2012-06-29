(ns tree-data.core-test
  (:use clojure.test
        tree-data.core))

;; --------- Test data ------------
(def categories
  '(("1.1" "Network" nil)
    ("1.2" "Beehive" 
     (("1.2.1" "Workspaces" nil)
     ("1.2.2" "Passwords" nil))
     ))
  )
(def parent-id "2.1")
(def new-node "Wikis")
(def new-tree (add-child-node categories parent-id new-node))
(def list-of-lists '(("a" 1)("b" 2) ("c" 3)))
(def top-level-ids (get-top-level-ids list-of-lists))
(def cat-top-level-ids (get-top-level-ids categories))



;; ------------- Tests -----------------
;; ---- in progress  ----
(deftest get-list-by-id-test
  (let [found-list (get-list-by-id categories "1.2")]
    (is (= "Beehive" (second found-list)))
    ))

;; ------ working -------
(deftest get-top-level-ids-test
  (testing "Given a list of lists extract the first element of each list"
    (let [lol '(("a" 1)("b" 2))
          top-level-ids (get-top-level-ids lol)
          should-be '("a" "b")]
      (is (= should-be top-level-ids)))))


;; (deftest add-child-node-test
;;   (testing "Adding a child node to a given tree under a specified parent."
;;     (let [parent "2.1"
;;           new-node ("Wikis")
;;           new-tree (add-child-node parent new-node)]
;;       (is (= "Wikis" (new-tree "2.1.1"))))))
;;       (is (= ("a" "b") top-level-ids))
